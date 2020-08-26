package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.MD5DSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaGetResponseData extends js.Object {
  var api: js.Array[String] = js.native
  var git: js.Array[String] = js.native
  var hooks: js.Array[String] = js.native
  var importer: js.Array[String] = js.native
  var pages: js.Array[String] = js.native
  var ssh_key_fingerprints: MD5DSA = js.native
  var verifiable_password_authentication: Boolean = js.native
  var web: js.Array[String] = js.native
}

object MetaGetResponseData {
  @scala.inline
  def apply(
    api: js.Array[String],
    git: js.Array[String],
    hooks: js.Array[String],
    importer: js.Array[String],
    pages: js.Array[String],
    ssh_key_fingerprints: MD5DSA,
    verifiable_password_authentication: Boolean,
    web: js.Array[String]
  ): MetaGetResponseData = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], importer = importer.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], ssh_key_fingerprints = ssh_key_fingerprints.asInstanceOf[js.Any], verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaGetResponseData]
  }
  @scala.inline
  implicit class MetaGetResponseDataOps[Self <: MetaGetResponseData] (val x: Self) extends AnyVal {
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
    def setApiVarargs(value: String*): Self = this.set("api", js.Array(value :_*))
    @scala.inline
    def setApi(value: js.Array[String]): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitVarargs(value: String*): Self = this.set("git", js.Array(value :_*))
    @scala.inline
    def setGit(value: js.Array[String]): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def setHooksVarargs(value: String*): Self = this.set("hooks", js.Array(value :_*))
    @scala.inline
    def setHooks(value: js.Array[String]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setImporterVarargs(value: String*): Self = this.set("importer", js.Array(value :_*))
    @scala.inline
    def setImporter(value: js.Array[String]): Self = this.set("importer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagesVarargs(value: String*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[String]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsh_key_fingerprints(value: MD5DSA): Self = this.set("ssh_key_fingerprints", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerifiable_password_authentication(value: Boolean): Self = this.set("verifiable_password_authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebVarargs(value: String*): Self = this.set("web", js.Array(value :_*))
    @scala.inline
    def setWeb(value: js.Array[String]): Self = this.set("web", value.asInstanceOf[js.Any])
  }
  
}

