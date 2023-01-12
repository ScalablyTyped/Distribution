package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.PartialSdkConfiguration
import typings.onfidoSdkUi.anon.SmsNumber
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<onfido-sdk-ui.onfido-sdk-ui.SdkOptions, 'steps'> */
trait NormalisedSdkOptions extends StObject {
  
  var _crossDeviceLinkMethods: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var autoFocusOnInitialScreenTitle: js.UndefOr[Boolean] = js.undefined
  
  var containerEl: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var containerId: js.UndefOr[String] = js.undefined
  
  var crossDeviceClientIntroProductLogoSrc: js.UndefOr[String] = js.undefined
  
  var crossDeviceClientIntroProductName: js.UndefOr[String] = js.undefined
  
  var customUI: js.UndefOr[UICustomizationOptions | Null] = js.undefined
  
  var disableAnalytics: js.UndefOr[Boolean] = js.undefined
  
  var disableAnalyticsCookies: js.UndefOr[Boolean] = js.undefined
  
  var enterpriseFeatures: js.UndefOr[EnterpriseFeatures] = js.undefined
  
  var isModalOpen: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[SupportedLanguages | LocaleConfig] = js.undefined
  
  var mobileFlow: js.UndefOr[Boolean] = js.undefined
  
  var onComplete: js.UndefOr[js.Function1[/* data */ SdkResponse, Unit]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ SdkError, Unit]] = js.undefined
  
  var onModalRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onUserExit: js.UndefOr[js.Function1[/* data */ UserExitCode, Unit]] = js.undefined
  
  var overrideSdkConfiguration: js.UndefOr[PartialSdkConfiguration] = js.undefined
  
  var region: js.UndefOr[ServerRegions] = js.undefined
  
  var roomId: js.UndefOr[String] = js.undefined
  
  var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined
  
  var smsNumberCountryCode: js.UndefOr[String] = js.undefined
  
  var steps: js.Array[StepConfig]
  
  var tearDown: js.UndefOr[Boolean] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var useMemoryHistory: js.UndefOr[Boolean] = js.undefined
  
  var useModal: js.UndefOr[Boolean] = js.undefined
  
  var useWorkflow: js.UndefOr[Boolean] = js.undefined
  
  var userDetails: js.UndefOr[SmsNumber] = js.undefined
  
  var workflowRunId: js.UndefOr[String] = js.undefined
}
object NormalisedSdkOptions {
  
  inline def apply(steps: js.Array[StepConfig]): NormalisedSdkOptions = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalisedSdkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalisedSdkOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoFocusOnInitialScreenTitle(value: Boolean): Self = StObject.set(x, "autoFocusOnInitialScreenTitle", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusOnInitialScreenTitleUndefined: Self = StObject.set(x, "autoFocusOnInitialScreenTitle", js.undefined)
    
    inline def setContainerEl(value: HTMLElement): Self = StObject.set(x, "containerEl", value.asInstanceOf[js.Any])
    
    inline def setContainerElNull: Self = StObject.set(x, "containerEl", null)
    
    inline def setContainerElUndefined: Self = StObject.set(x, "containerEl", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setCrossDeviceClientIntroProductLogoSrc(value: String): Self = StObject.set(x, "crossDeviceClientIntroProductLogoSrc", value.asInstanceOf[js.Any])
    
    inline def setCrossDeviceClientIntroProductLogoSrcUndefined: Self = StObject.set(x, "crossDeviceClientIntroProductLogoSrc", js.undefined)
    
    inline def setCrossDeviceClientIntroProductName(value: String): Self = StObject.set(x, "crossDeviceClientIntroProductName", value.asInstanceOf[js.Any])
    
    inline def setCrossDeviceClientIntroProductNameUndefined: Self = StObject.set(x, "crossDeviceClientIntroProductName", js.undefined)
    
    inline def setCustomUI(value: UICustomizationOptions): Self = StObject.set(x, "customUI", value.asInstanceOf[js.Any])
    
    inline def setCustomUINull: Self = StObject.set(x, "customUI", null)
    
    inline def setCustomUIUndefined: Self = StObject.set(x, "customUI", js.undefined)
    
    inline def setDisableAnalytics(value: Boolean): Self = StObject.set(x, "disableAnalytics", value.asInstanceOf[js.Any])
    
    inline def setDisableAnalyticsCookies(value: Boolean): Self = StObject.set(x, "disableAnalyticsCookies", value.asInstanceOf[js.Any])
    
    inline def setDisableAnalyticsCookiesUndefined: Self = StObject.set(x, "disableAnalyticsCookies", js.undefined)
    
    inline def setDisableAnalyticsUndefined: Self = StObject.set(x, "disableAnalytics", js.undefined)
    
    inline def setEnterpriseFeatures(value: EnterpriseFeatures): Self = StObject.set(x, "enterpriseFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseFeaturesUndefined: Self = StObject.set(x, "enterpriseFeatures", js.undefined)
    
    inline def setIsModalOpen(value: Boolean): Self = StObject.set(x, "isModalOpen", value.asInstanceOf[js.Any])
    
    inline def setIsModalOpenUndefined: Self = StObject.set(x, "isModalOpen", js.undefined)
    
    inline def setLanguage(value: SupportedLanguages | LocaleConfig): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMobileFlow(value: Boolean): Self = StObject.set(x, "mobileFlow", value.asInstanceOf[js.Any])
    
    inline def setMobileFlowUndefined: Self = StObject.set(x, "mobileFlow", js.undefined)
    
    inline def setOnComplete(value: /* data */ SdkResponse => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnError(value: /* error */ SdkError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnModalRequestClose(value: () => Unit): Self = StObject.set(x, "onModalRequestClose", js.Any.fromFunction0(value))
    
    inline def setOnModalRequestCloseUndefined: Self = StObject.set(x, "onModalRequestClose", js.undefined)
    
    inline def setOnUserExit(value: /* data */ UserExitCode => Unit): Self = StObject.set(x, "onUserExit", js.Any.fromFunction1(value))
    
    inline def setOnUserExitUndefined: Self = StObject.set(x, "onUserExit", js.undefined)
    
    inline def setOverrideSdkConfiguration(value: PartialSdkConfiguration): Self = StObject.set(x, "overrideSdkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOverrideSdkConfigurationUndefined: Self = StObject.set(x, "overrideSdkConfiguration", js.undefined)
    
    inline def setRegion(value: ServerRegions): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
    
    inline def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
    
    inline def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
    
    inline def setSmsNumberCountryCode(value: String): Self = StObject.set(x, "smsNumberCountryCode", value.asInstanceOf[js.Any])
    
    inline def setSmsNumberCountryCodeUndefined: Self = StObject.set(x, "smsNumberCountryCode", js.undefined)
    
    inline def setSteps(value: js.Array[StepConfig]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: StepConfig*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTearDown(value: Boolean): Self = StObject.set(x, "tearDown", value.asInstanceOf[js.Any])
    
    inline def setTearDownUndefined: Self = StObject.set(x, "tearDown", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUseMemoryHistory(value: Boolean): Self = StObject.set(x, "useMemoryHistory", value.asInstanceOf[js.Any])
    
    inline def setUseMemoryHistoryUndefined: Self = StObject.set(x, "useMemoryHistory", js.undefined)
    
    inline def setUseModal(value: Boolean): Self = StObject.set(x, "useModal", value.asInstanceOf[js.Any])
    
    inline def setUseModalUndefined: Self = StObject.set(x, "useModal", js.undefined)
    
    inline def setUseWorkflow(value: Boolean): Self = StObject.set(x, "useWorkflow", value.asInstanceOf[js.Any])
    
    inline def setUseWorkflowUndefined: Self = StObject.set(x, "useWorkflow", js.undefined)
    
    inline def setUserDetails(value: SmsNumber): Self = StObject.set(x, "userDetails", value.asInstanceOf[js.Any])
    
    inline def setUserDetailsUndefined: Self = StObject.set(x, "userDetails", js.undefined)
    
    inline def setWorkflowRunId(value: String): Self = StObject.set(x, "workflowRunId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowRunIdUndefined: Self = StObject.set(x, "workflowRunId", js.undefined)
    
    inline def set_crossDeviceLinkMethods(value: js.Array[String]): Self = StObject.set(x, "_crossDeviceLinkMethods", value.asInstanceOf[js.Any])
    
    inline def set_crossDeviceLinkMethodsNull: Self = StObject.set(x, "_crossDeviceLinkMethods", null)
    
    inline def set_crossDeviceLinkMethodsUndefined: Self = StObject.set(x, "_crossDeviceLinkMethods", js.undefined)
    
    inline def set_crossDeviceLinkMethodsVarargs(value: String*): Self = StObject.set(x, "_crossDeviceLinkMethods", js.Array(value*))
  }
}
