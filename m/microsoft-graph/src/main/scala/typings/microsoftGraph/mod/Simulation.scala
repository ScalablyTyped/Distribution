package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Simulation
  extends StObject
     with Entity {
  
  /**
    * The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby.
    * Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile,
    * unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations.
    */
  var attackTechnique: js.UndefOr[NullableOption[SimulationAttackTechnique]] = js.undefined
  
  /**
    * Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are:
    * unknown, social, cloud, endpoint, unknownFutureValue.
    */
  var attackType: js.UndefOr[NullableOption[SimulationAttackType]] = js.undefined
  
  // Unique identifier for the attack simulation automation.
  var automationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
  var completionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the user who created the attack simulation and training campaign.
  var createdBy: js.UndefOr[NullableOption[EmailIdentity]] = js.undefined
  
  // Date and time of creation of the attack simulation and training campaign.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description of the attack simulation and training campaign.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the attack simulation and training campaign. Supports $filter and $orderby.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Flag that represents if the attack simulation and training campaign was created from a simulation automation flow.
    * Supports $filter and $orderby.
    */
  var isAutomated: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Identity of the user who most recently modified the attack simulation and training campaign.
  var lastModifiedBy: js.UndefOr[NullableOption[EmailIdentity]] = js.undefined
  
  // Date and time of the most recent modification of the attack simulation and training campaign.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
  var launchDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are:
    * unknown, sms, email, teams, unknownFutureValue.
    */
  var payloadDeliveryPlatform: js.UndefOr[NullableOption[PayloadDeliveryPlatform]] = js.undefined
  
  // Report of the attack simulation and training campaign.
  var report: js.UndefOr[NullableOption[SimulationReport]] = js.undefined
  
  /**
    * Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown,
    * draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[SimulationStatus]] = js.undefined
}
object Simulation {
  
  inline def apply(): Simulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Simulation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Simulation] (val x: Self) extends AnyVal {
    
    inline def setAttackTechnique(value: NullableOption[SimulationAttackTechnique]): Self = StObject.set(x, "attackTechnique", value.asInstanceOf[js.Any])
    
    inline def setAttackTechniqueNull: Self = StObject.set(x, "attackTechnique", null)
    
    inline def setAttackTechniqueUndefined: Self = StObject.set(x, "attackTechnique", js.undefined)
    
    inline def setAttackType(value: NullableOption[SimulationAttackType]): Self = StObject.set(x, "attackType", value.asInstanceOf[js.Any])
    
    inline def setAttackTypeNull: Self = StObject.set(x, "attackType", null)
    
    inline def setAttackTypeUndefined: Self = StObject.set(x, "attackType", js.undefined)
    
    inline def setAutomationId(value: NullableOption[String]): Self = StObject.set(x, "automationId", value.asInstanceOf[js.Any])
    
    inline def setAutomationIdNull: Self = StObject.set(x, "automationId", null)
    
    inline def setAutomationIdUndefined: Self = StObject.set(x, "automationId", js.undefined)
    
    inline def setCompletionDateTime(value: NullableOption[String]): Self = StObject.set(x, "completionDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateTimeNull: Self = StObject.set(x, "completionDateTime", null)
    
    inline def setCompletionDateTimeUndefined: Self = StObject.set(x, "completionDateTime", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[EmailIdentity]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsAutomated(value: NullableOption[Boolean]): Self = StObject.set(x, "isAutomated", value.asInstanceOf[js.Any])
    
    inline def setIsAutomatedNull: Self = StObject.set(x, "isAutomated", null)
    
    inline def setIsAutomatedUndefined: Self = StObject.set(x, "isAutomated", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[EmailIdentity]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLaunchDateTime(value: NullableOption[String]): Self = StObject.set(x, "launchDateTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchDateTimeNull: Self = StObject.set(x, "launchDateTime", null)
    
    inline def setLaunchDateTimeUndefined: Self = StObject.set(x, "launchDateTime", js.undefined)
    
    inline def setPayloadDeliveryPlatform(value: NullableOption[PayloadDeliveryPlatform]): Self = StObject.set(x, "payloadDeliveryPlatform", value.asInstanceOf[js.Any])
    
    inline def setPayloadDeliveryPlatformNull: Self = StObject.set(x, "payloadDeliveryPlatform", null)
    
    inline def setPayloadDeliveryPlatformUndefined: Self = StObject.set(x, "payloadDeliveryPlatform", js.undefined)
    
    inline def setReport(value: NullableOption[SimulationReport]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportNull: Self = StObject.set(x, "report", null)
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setStatus(value: NullableOption[SimulationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
