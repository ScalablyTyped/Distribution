package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFSpecialObjectFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookup extends StObject {
  
  def Clone(): ILookup
  
  def CloneFrom(Lookup: ILookup): Unit
  
  var Deleted: Boolean
  
  val DisplayID: String
  
  val DisplayIDAvailable: Boolean
  
  var DisplayValue: String
  
  def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String
  
  val Hidden: Boolean
  
  var Item: Double
  
  var ItemGUID: String
  
  val ObjectFlags: MFSpecialObjectFlag
  
  var ObjectType: MFBuiltInObjectType | Double
  
  var Version: Double
}
object ILookup {
  
  @scala.inline
  def apply(
    Clone: () => ILookup,
    CloneFrom: ILookup => Unit,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    DisplayValue: String,
    GetFormattedDisplayValue: (Boolean, Boolean, Boolean) => String,
    Hidden: Boolean,
    Item: Double,
    ItemGUID: String,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectType: MFBuiltInObjectType | Double,
    Version: Double
  ): ILookup = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetFormattedDisplayValue = js.Any.fromFunction3(GetFormattedDisplayValue), Hidden = Hidden.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookup]
  }
  
  @scala.inline
  implicit class ILookupMutableBuilder[Self <: ILookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ILookup): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: ILookup => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayID(value: String): Self = StObject.set(x, "DisplayID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIDAvailable(value: Boolean): Self = StObject.set(x, "DisplayIDAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormattedDisplayValue(value: (Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetFormattedDisplayValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGUID(value: String): Self = StObject.set(x, "ItemGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFlags(value: MFSpecialObjectFlag): Self = StObject.set(x, "ObjectFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
