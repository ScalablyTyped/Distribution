package typings.mendixmodelsdk.anon

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copy extends js.Object {
  
  var copy: Element[IAbstractModel] = js.native
  
  var idMap: IMap[Structure[IAbstractModel, IContainer | Null]] = js.native
}
object Copy {
  
  @scala.inline
  def apply(copy: Element[IAbstractModel], idMap: IMap[Structure[IAbstractModel, IContainer | Null]]): Copy = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyOps[Self <: Copy] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: Element[IAbstractModel]): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdMap(value: IMap[Structure[IAbstractModel, IContainer | Null]]): Self = this.set("idMap", value.asInstanceOf[js.Any])
  }
}
