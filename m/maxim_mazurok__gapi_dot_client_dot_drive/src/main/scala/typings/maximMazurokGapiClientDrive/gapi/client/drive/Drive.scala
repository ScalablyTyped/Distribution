package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.maximMazurokGapiClientDrive.anon.AdminManagedRestrictions
import typings.maximMazurokGapiClientDrive.anon.CanAddChildren
import typings.maximMazurokGapiClientDrive.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drive extends StObject {
  
  /**
    * An image file and cropping parameters from which a background image for this shared drive is set. This is a write only field; it can only be set on drive.drives.update requests that
    * don't set themeId. When specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[Id] = js.undefined
  
  /** A short-lived link to this shared drive's background image. */
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  
  /** Capabilities the current user has on this shared drive. */
  var capabilities: js.UndefOr[CanAddChildren] = js.undefined
  
  /** The color of this shared drive as an RGB hex string. It can only be set on a drive.drives.update request that does not set themeId. */
  var colorRgb: js.UndefOr[String] = js.undefined
  
  /** The time at which the shared drive was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.undefined
  
  /** Whether the shared drive is hidden from default view. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of this shared drive which is also the ID of the top level folder of this shared drive. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#drive". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of this shared drive. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A set of restrictions that apply to this shared drive or items inside this shared drive. */
  var restrictions: js.UndefOr[AdminManagedRestrictions] = js.undefined
  
  /**
    * The ID of the theme from which the background image and color will be set. The set of possible driveThemes can be retrieved from a drive.about.get response. When not specified on a
    * drive.drives.create request, a random theme is chosen from which the background image and color are set. This is a write-only field; it can only be set on requests that don't set
    * colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.undefined
}
object Drive {
  
  inline def apply(): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drive]
  }
  
  extension [Self <: Drive](x: Self) {
    
    inline def setBackgroundImageFile(value: Id): Self = StObject.set(x, "backgroundImageFile", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageFileUndefined: Self = StObject.set(x, "backgroundImageFile", js.undefined)
    
    inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
    
    inline def setCapabilities(value: CanAddChildren): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
    
    inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
    
    inline def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictions(value: AdminManagedRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setThemeId(value: String): Self = StObject.set(x, "themeId", value.asInstanceOf[js.Any])
    
    inline def setThemeIdUndefined: Self = StObject.set(x, "themeId", js.undefined)
  }
}
