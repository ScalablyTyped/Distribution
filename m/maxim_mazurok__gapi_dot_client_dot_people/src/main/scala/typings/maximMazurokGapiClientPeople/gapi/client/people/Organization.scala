package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  /** True if the organization is the person's current organization; false if the organization is a past organization. */
  var current: js.UndefOr[Boolean] = js.undefined
  
  /** The person's department at the organization. */
  var department: js.UndefOr[String] = js.undefined
  
  /** The domain name associated with the organization; for example, `google.com`. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** The end date when the person left the organization. */
  var endDate: js.UndefOr[Date] = js.undefined
  
  /** Output only. The type of the organization translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /** The person's job description at the organization. */
  var jobDescription: js.UndefOr[String] = js.undefined
  
  /** The location of the organization office the person works at. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Metadata about the organization. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The phonetic name of the organization. */
  var phoneticName: js.UndefOr[String] = js.undefined
  
  /** The start date when the person joined the organization. */
  var startDate: js.UndefOr[Date] = js.undefined
  
  /** The symbol associated with the organization; for example, a stock ticker symbol, abbreviation, or acronym. */
  var symbol: js.UndefOr[String] = js.undefined
  
  /** The person's job title at the organization. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The type of the organization. The type can be custom or one of these predefined values: * `work` * `school` */
  var `type`: js.UndefOr[String] = js.undefined
}
object Organization {
  
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit class OrganizationMutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setJobDescription(value: String): Self = StObject.set(x, "jobDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDescriptionUndefined: Self = StObject.set(x, "jobDescription", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
