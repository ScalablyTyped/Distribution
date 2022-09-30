package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.TopLevel
import typings.onfidoSdkUi.mod.^
import typings.onfidoSdkUi.onfidoSdkUiStrings.USER_CONSENT_DENIED
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def init: SdkInitMethod = ^.asInstanceOf[js.Dynamic].selectDynamic("init").asInstanceOf[SdkInitMethod]

type DocumentTypeConfig = Boolean | CountryConfig

type GetPersonalDataFunc = js.Function0[Record[String, Any]]

type PrivateStepTypes = /* "retry" */ String

type PublicStepConfig = StepConfigWelcome | StepConfigDocument | StepConfigPoa | StepConfigFace | StepConfigComplete | StepConfigAuth | StepConfigActiveVideo | StepConfigCrossDeviceSessionIntro | StepConfigData | StepConfigRetry

type PublicStepTypes = /* "welcome" */ String

type SdkInitMethod = js.Function1[/* options */ SdkOptions, SdkHandle]

type StepConfig = (PublicStepConfig & PrivateStepConfig) | (StepConfigUserConsent & PrivateStepConfig)

type StepConfigActiveVideo = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['activeVideo'] */ js.Any

type StepConfigAuth = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['auth'] */ js.Any

type StepConfigComplete = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['complete'] */ js.Any

type StepConfigCrossDeviceSessionIntro = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['crossDeviceSessionIntro'] */ js.Any

type StepConfigData = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['data'] */ js.Any

type StepConfigDocument = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['document'] */ js.Any

type StepConfigFace = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['face'] */ js.Any

type StepConfigMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Type in onfido-sdk-ui.onfido-sdk-ui.StepTypes ]: {  type :Type,   options :onfido-sdk-ui.onfido-sdk-ui.StepOptionsMap[Type] | undefined}}
  */ typings.onfidoSdkUi.onfidoSdkUiStrings.StepConfigMap & TopLevel[StepOptionsMap]

type StepConfigPoa = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['poa'] */ js.Any

type StepConfigRetry = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['retry'] */ js.Any

type StepConfigUserConsent = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['userConsent'] */ js.Any

type StepConfigWelcome = /* import warning: importer.ImportType#apply Failed type conversion: onfido-sdk-ui.onfido-sdk-ui.StepConfigMap['welcome'] */ js.Any

type StepTypes = PublicStepTypes | PrivateStepTypes

type UserExitCode = USER_CONSENT_DENIED
