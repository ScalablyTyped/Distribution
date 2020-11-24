package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cflags extends js.Object {
  
  var cflags: js.Array[_] = js.native
  
  var default_configuration: String = js.native
  
  var defines: js.Array[String] = js.native
  
  var include_dirs: js.Array[String] = js.native
  
  var libraries: js.Array[String] = js.native
}
object Cflags {
  
  @scala.inline
  def apply(
    cflags: js.Array[_],
    default_configuration: String,
    defines: js.Array[String],
    include_dirs: js.Array[String],
    libraries: js.Array[String]
  ): Cflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cflags]
  }
  
  @scala.inline
  implicit class CflagsOps[Self <: Cflags] (val x: Self) extends AnyVal {
    
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
    def setCflagsVarargs(value: js.Any*): Self = this.set("cflags", js.Array(value :_*))
    
    @scala.inline
    def setCflags(value: js.Array[_]): Self = this.set("cflags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_configuration(value: String): Self = this.set("default_configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = this.set("defines", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_dirsVarargs(value: String*): Self = this.set("include_dirs", js.Array(value :_*))
    
    @scala.inline
    def setInclude_dirs(value: js.Array[String]): Self = this.set("include_dirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibrariesVarargs(value: String*): Self = this.set("libraries", js.Array(value :_*))
    
    @scala.inline
    def setLibraries(value: js.Array[String]): Self = this.set("libraries", value.asInstanceOf[js.Any])
  }
}
