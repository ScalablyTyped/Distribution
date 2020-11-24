package typings.mobxStateTree.mstOperationsMod

import org.scalablytyped.runtime.StringDictionary
import typings.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelReflectionData extends IModelReflectionPropertiesData {
  
  var actions: js.Array[String] = js.native
  
  var views: js.Array[String] = js.native
  
  var volatile: js.Array[String] = js.native
}
object IModelReflectionData {
  
  @scala.inline
  def apply(
    actions: js.Array[String],
    name: String,
    properties: StringDictionary[IAnyType],
    views: js.Array[String],
    volatile: js.Array[String]
  ): IModelReflectionData = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelReflectionData]
  }
  
  @scala.inline
  implicit class IModelReflectionDataOps[Self <: IModelReflectionData] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: String*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[String]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolatileVarargs(value: String*): Self = this.set("volatile", js.Array(value :_*))
    
    @scala.inline
    def setVolatile(value: js.Array[String]): Self = this.set("volatile", value.asInstanceOf[js.Any])
  }
}
