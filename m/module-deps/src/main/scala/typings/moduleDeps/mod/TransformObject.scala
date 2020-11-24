package typings.moduleDeps.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformObject extends js.Object {
  
  var deps: StringDictionary[js.Any] = js.native
  
  var entry: Boolean = js.native
  
  var expose: String = js.native
  
  var file: String = js.native
  
  var id: String = js.native
  
  var source: String = js.native
}
object TransformObject {
  
  @scala.inline
  def apply(
    deps: StringDictionary[js.Any],
    entry: Boolean,
    expose: String,
    file: String,
    id: String,
    source: String
  ): TransformObject = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformObject]
  }
  
  @scala.inline
  implicit class TransformObjectOps[Self <: TransformObject] (val x: Self) extends AnyVal {
    
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
    def setDeps(value: StringDictionary[js.Any]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntry(value: Boolean): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpose(value: String): Self = this.set("expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
