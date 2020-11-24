package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy extends js.Object {
  
  /**
    * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is allowed. One can allow all repositories under a project or one specific repository only.
    * E.g. container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io/project-bar/repo-baz", ] } will allow any repositories under "gcr.io/project-foo"
    * plus the repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is allowed.
    */
  var containerImageSources: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** Whether dockerAddCapabilities can be used or what capabilities are allowed. */
  var dockerAddCapabilities: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** Whether dockerChrootPath can be used. */
  var dockerChrootPath: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off` value only via `allowed_values`. */
  var dockerNetwork: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** Whether dockerPrivileged can be used. */
  var dockerPrivileged: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** Whether dockerRunAsRoot can be used. */
  var dockerRunAsRoot: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /**
    * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation takes precedence, and if set, docker_runtime values may be rejected if they are
    * incompatible with the selected isolation.
    */
  var dockerRuntime: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** Whether dockerSiblingContainers can be used. */
  var dockerSiblingContainers: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.native
  
  /** linux_isolation allows overriding the docker runtime used for containers started on Linux. */
  var linuxIsolation: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyOps[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerImageSources(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("containerImageSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImageSources: Self = this.set("containerImageSources", js.undefined)
    
    @scala.inline
    def setDockerAddCapabilities(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerAddCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerAddCapabilities: Self = this.set("dockerAddCapabilities", js.undefined)
    
    @scala.inline
    def setDockerChrootPath(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerChrootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerChrootPath: Self = this.set("dockerChrootPath", js.undefined)
    
    @scala.inline
    def setDockerNetwork(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerNetwork: Self = this.set("dockerNetwork", js.undefined)
    
    @scala.inline
    def setDockerPrivileged(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerPrivileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerPrivileged: Self = this.set("dockerPrivileged", js.undefined)
    
    @scala.inline
    def setDockerRunAsRoot(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerRunAsRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerRunAsRoot: Self = this.set("dockerRunAsRoot", js.undefined)
    
    @scala.inline
    def setDockerRuntime(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerRuntime: Self = this.set("dockerRuntime", js.undefined)
    
    @scala.inline
    def setDockerSiblingContainers(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = this.set("dockerSiblingContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerSiblingContainers: Self = this.set("dockerSiblingContainers", js.undefined)
    
    @scala.inline
    def setLinuxIsolation(value: String): Self = this.set("linuxIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinuxIsolation: Self = this.set("linuxIsolation", js.undefined)
  }
}
