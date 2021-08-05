package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTemplateSelectorItem extends StObject {
  
  def GetClassID(): Double
  
  def GetClassName(): String
  
  def GetGroupID(): Double
  
  def GetGroupName(): String
  
  def GetID(): String
  
  def GetIconURL(): String
  
  def GetName(): String
  
  def GetTemplateID(): Double
  
  def IsBlankItem(): Boolean
  
  def IsDefaultTemplateForClass(): Boolean
}
object IObjectTemplateSelectorItem {
  
  inline def apply(
    GetClassID: () => Double,
    GetClassName: () => String,
    GetGroupID: () => Double,
    GetGroupName: () => String,
    GetID: () => String,
    GetIconURL: () => String,
    GetName: () => String,
    GetTemplateID: () => Double,
    IsBlankItem: () => Boolean,
    IsDefaultTemplateForClass: () => Boolean
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal(GetClassID = js.Any.fromFunction0(GetClassID), GetClassName = js.Any.fromFunction0(GetClassName), GetGroupID = js.Any.fromFunction0(GetGroupID), GetGroupName = js.Any.fromFunction0(GetGroupName), GetID = js.Any.fromFunction0(GetID), GetIconURL = js.Any.fromFunction0(GetIconURL), GetName = js.Any.fromFunction0(GetName), GetTemplateID = js.Any.fromFunction0(GetTemplateID), IsBlankItem = js.Any.fromFunction0(IsBlankItem), IsDefaultTemplateForClass = js.Any.fromFunction0(IsDefaultTemplateForClass))
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
  
  extension [Self <: IObjectTemplateSelectorItem](x: Self) {
    
    inline def setGetClassID(value: () => Double): Self = StObject.set(x, "GetClassID", js.Any.fromFunction0(value))
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "GetClassName", js.Any.fromFunction0(value))
    
    inline def setGetGroupID(value: () => Double): Self = StObject.set(x, "GetGroupID", js.Any.fromFunction0(value))
    
    inline def setGetGroupName(value: () => String): Self = StObject.set(x, "GetGroupName", js.Any.fromFunction0(value))
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "GetID", js.Any.fromFunction0(value))
    
    inline def setGetIconURL(value: () => String): Self = StObject.set(x, "GetIconURL", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "GetName", js.Any.fromFunction0(value))
    
    inline def setGetTemplateID(value: () => Double): Self = StObject.set(x, "GetTemplateID", js.Any.fromFunction0(value))
    
    inline def setIsBlankItem(value: () => Boolean): Self = StObject.set(x, "IsBlankItem", js.Any.fromFunction0(value))
    
    inline def setIsDefaultTemplateForClass(value: () => Boolean): Self = StObject.set(x, "IsDefaultTemplateForClass", js.Any.fromFunction0(value))
  }
}
