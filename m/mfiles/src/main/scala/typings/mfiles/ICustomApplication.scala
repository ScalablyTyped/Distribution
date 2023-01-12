package typings.mfiles

import typings.mfiles.MFiles.MFCustomApplicationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomApplication extends StObject {
  
  val ApplicationType: MFCustomApplicationType
  
  val ChecksumHash: String
  
  def Clone(): ICustomApplication
  
  val Description: String
  
  val Enabled: Boolean
  
  val ID: String
  
  val MasterApplication: String
  
  val Name: String
  
  val Optional: Boolean
  
  val Publisher: String
  
  val RequireSystemAccess: Boolean
  
  val Version: String
}
object ICustomApplication {
  
  inline def apply(
    ApplicationType: MFCustomApplicationType,
    ChecksumHash: String,
    Clone: () => ICustomApplication,
    Description: String,
    Enabled: Boolean,
    ID: String,
    MasterApplication: String,
    Name: String,
    Optional: Boolean,
    Publisher: String,
    RequireSystemAccess: Boolean,
    Version: String
  ): ICustomApplication = {
    val __obj = js.Dynamic.literal(ApplicationType = ApplicationType.asInstanceOf[js.Any], ChecksumHash = ChecksumHash.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MasterApplication = MasterApplication.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Optional = Optional.asInstanceOf[js.Any], Publisher = Publisher.asInstanceOf[js.Any], RequireSystemAccess = RequireSystemAccess.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICustomApplication] (val x: Self) extends AnyVal {
    
    inline def setApplicationType(value: MFCustomApplicationType): Self = StObject.set(x, "ApplicationType", value.asInstanceOf[js.Any])
    
    inline def setChecksumHash(value: String): Self = StObject.set(x, "ChecksumHash", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ICustomApplication): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setMasterApplication(value: String): Self = StObject.set(x, "MasterApplication", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "Optional", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "Publisher", value.asInstanceOf[js.Any])
    
    inline def setRequireSystemAccess(value: Boolean): Self = StObject.set(x, "RequireSystemAccess", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
