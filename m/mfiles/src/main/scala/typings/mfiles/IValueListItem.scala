package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInValueList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItem extends StObject {
  
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  
  def Clone(): IValueListItem = js.native
  
  def CloneFrom(ValueListItem: IValueListItem): Unit = js.native
  
  val Deleted: Boolean = js.native
  
  val DisplayID: String = js.native
  
  val DisplayIDAvailable: Boolean = js.native
  
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  
  var HasOwner: Boolean = js.native
  
  var HasParent: Boolean = js.native
  
  var ID: Double = js.native
  
  var Icon: js.Array[Double] = js.native
  
  val ItemGUID: String = js.native
  
  var Name: String = js.native
  
  var OwnerID: Double = js.native
  
  var ParentID: Double = js.native
  
  var ValueListID: MFBuiltInValueList | Double = js.native
}
object IValueListItem {
  
  @scala.inline
  def apply(
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IValueListItem,
    CloneFrom: IValueListItem => Unit,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    GetIconAsPNG: (Double, Double) => js.Array[Double],
    HasOwner: Boolean,
    HasParent: Boolean,
    ID: Double,
    Icon: js.Array[Double],
    ItemGUID: String,
    Name: String,
    OwnerID: Double,
    ParentID: Double,
    ValueListID: MFBuiltInValueList | Double
  ): IValueListItem = {
    val __obj = js.Dynamic.literal(AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwner = HasOwner.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OwnerID = OwnerID.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], ValueListID = ValueListID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItem]
  }
  
  @scala.inline
  implicit class IValueListItemMutableBuilder[Self <: IValueListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = StObject.set(x, "AutomaticPermissionsForObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IValueListItem): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IValueListItem => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayID(value: String): Self = StObject.set(x, "DisplayID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIDAvailable(value: Boolean): Self = StObject.set(x, "DisplayIDAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "GetIconAsPNG", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasOwner(value: Boolean): Self = StObject.set(x, "HasOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasParent(value: Boolean): Self = StObject.set(x, "HasParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: js.Array[Double]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconVarargs(value: Double*): Self = StObject.set(x, "Icon", js.Array(value :_*))
    
    @scala.inline
    def setItemGUID(value: String): Self = StObject.set(x, "ItemGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerID(value: Double): Self = StObject.set(x, "OwnerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentID(value: Double): Self = StObject.set(x, "ParentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListID(value: MFBuiltInValueList | Double): Self = StObject.set(x, "ValueListID", value.asInstanceOf[js.Any])
  }
}
