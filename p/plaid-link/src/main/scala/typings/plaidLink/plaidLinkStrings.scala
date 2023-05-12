package typings.plaidLink

import typings.plaidLink.mod.Plaid.AuthTypeSelectFlow
import typings.plaidLink.mod.Plaid.Country
import typings.plaidLink.mod.Plaid.Environment
import typings.plaidLink.mod.Plaid.EventName
import typings.plaidLink.mod.Plaid.ExitStatus
import typings.plaidLink.mod.Plaid.Language
import typings.plaidLink.mod.Plaid.Product
import typings.plaidLink.mod.Plaid.TransferStatus
import typings.plaidLink.mod.Plaid.VerificationMethod
import typings.plaidLink.mod.Plaid.VerificationStatus
import typings.plaidLink.mod.Plaid.ViewName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plaidLinkStrings {
  
  @js.native
  sealed trait ACCEPT_TOS
    extends StObject
       with ViewName
  inline def ACCEPT_TOS: ACCEPT_TOS = "ACCEPT_TOS".asInstanceOf[ACCEPT_TOS]
  
  @js.native
  sealed trait BANK_INCOME_INSIGHTS_COMPLETED
    extends StObject
       with EventName
  inline def BANK_INCOME_INSIGHTS_COMPLETED: BANK_INCOME_INSIGHTS_COMPLETED = "BANK_INCOME_INSIGHTS_COMPLETED".asInstanceOf[BANK_INCOME_INSIGHTS_COMPLETED]
  
  @js.native
  sealed trait CA
    extends StObject
       with Country
  inline def CA: CA = "CA".asInstanceOf[CA]
  
  @js.native
  sealed trait CLOSE_OAUTH
    extends StObject
       with EventName
  inline def CLOSE_OAUTH: CLOSE_OAUTH = "CLOSE_OAUTH".asInstanceOf[CLOSE_OAUTH]
  
  @js.native
  sealed trait COMPLETE
    extends StObject
       with TransferStatus
  inline def COMPLETE: COMPLETE = "COMPLETE".asInstanceOf[COMPLETE]
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ViewName
  inline def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @js.native
  sealed trait CONSENT
    extends StObject
       with ViewName
  inline def CONSENT: CONSENT = "CONSENT".asInstanceOf[CONSENT]
  
  @js.native
  sealed trait CREDENTIAL
    extends StObject
       with ViewName
  inline def CREDENTIAL: CREDENTIAL = "CREDENTIAL".asInstanceOf[CREDENTIAL]
  
  @js.native
  sealed trait DATA_TRANSPARENCY
    extends StObject
       with ViewName
  inline def DATA_TRANSPARENCY: DATA_TRANSPARENCY = "DATA_TRANSPARENCY".asInstanceOf[DATA_TRANSPARENCY]
  
  @js.native
  sealed trait DATA_TRANSPARENCY_CONSENT
    extends StObject
       with ViewName
  inline def DATA_TRANSPARENCY_CONSENT: DATA_TRANSPARENCY_CONSENT = "DATA_TRANSPARENCY_CONSENT".asInstanceOf[DATA_TRANSPARENCY_CONSENT]
  
  @js.native
  sealed trait DE
    extends StObject
       with Country
  inline def DE: DE = "DE".asInstanceOf[DE]
  
  @js.native
  sealed trait DK
    extends StObject
       with Country
  inline def DK: DK = "DK".asInstanceOf[DK]
  
  @js.native
  sealed trait DOCUMENTARY_VERIFICATION
    extends StObject
       with ViewName
  inline def DOCUMENTARY_VERIFICATION: DOCUMENTARY_VERIFICATION = "DOCUMENTARY_VERIFICATION".asInstanceOf[DOCUMENTARY_VERIFICATION]
  
  @js.native
  sealed trait EE
    extends StObject
       with Country
  inline def EE: EE = "EE".asInstanceOf[EE]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with EventName
       with ViewName
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait ES
    extends StObject
       with Country
  inline def ES: ES = "ES".asInstanceOf[ES]
  
  @js.native
  sealed trait EXIT
    extends StObject
       with EventName
       with ViewName
  inline def EXIT: EXIT = "EXIT".asInstanceOf[EXIT]
  
  @js.native
  sealed trait FAIL_OAUTH
    extends StObject
       with EventName
  inline def FAIL_OAUTH: FAIL_OAUTH = "FAIL_OAUTH".asInstanceOf[FAIL_OAUTH]
  
  @js.native
  sealed trait FR
    extends StObject
       with Country
  inline def FR: FR = "FR".asInstanceOf[FR]
  
  @js.native
  sealed trait GB
    extends StObject
       with Country
  inline def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait HANDOFF
    extends StObject
       with EventName
  inline def HANDOFF: HANDOFF = "HANDOFF".asInstanceOf[HANDOFF]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_CLOSE_UI
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_CLOSE_UI: IDENTITY_VERIFICATION_CLOSE_UI = "IDENTITY_VERIFICATION_CLOSE_UI".asInstanceOf[IDENTITY_VERIFICATION_CLOSE_UI]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_CREATE_SESSION
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_CREATE_SESSION: IDENTITY_VERIFICATION_CREATE_SESSION = "IDENTITY_VERIFICATION_CREATE_SESSION".asInstanceOf[IDENTITY_VERIFICATION_CREATE_SESSION]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_FAIL_SESSION
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_FAIL_SESSION: IDENTITY_VERIFICATION_FAIL_SESSION = "IDENTITY_VERIFICATION_FAIL_SESSION".asInstanceOf[IDENTITY_VERIFICATION_FAIL_SESSION]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_FAIL_STEP
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_FAIL_STEP: IDENTITY_VERIFICATION_FAIL_STEP = "IDENTITY_VERIFICATION_FAIL_STEP".asInstanceOf[IDENTITY_VERIFICATION_FAIL_STEP]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_OPEN_UI
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_OPEN_UI: IDENTITY_VERIFICATION_OPEN_UI = "IDENTITY_VERIFICATION_OPEN_UI".asInstanceOf[IDENTITY_VERIFICATION_OPEN_UI]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_PASS_SESSION
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_PASS_SESSION: IDENTITY_VERIFICATION_PASS_SESSION = "IDENTITY_VERIFICATION_PASS_SESSION".asInstanceOf[IDENTITY_VERIFICATION_PASS_SESSION]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_PASS_STEP
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_PASS_STEP: IDENTITY_VERIFICATION_PASS_STEP = "IDENTITY_VERIFICATION_PASS_STEP".asInstanceOf[IDENTITY_VERIFICATION_PASS_STEP]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_PENDING_REVIEW_STEP
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_PENDING_REVIEW_STEP: IDENTITY_VERIFICATION_PENDING_REVIEW_STEP = "IDENTITY_VERIFICATION_PENDING_REVIEW_STEP".asInstanceOf[IDENTITY_VERIFICATION_PENDING_REVIEW_STEP]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_RESUME_SESSION
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_RESUME_SESSION: IDENTITY_VERIFICATION_RESUME_SESSION = "IDENTITY_VERIFICATION_RESUME_SESSION".asInstanceOf[IDENTITY_VERIFICATION_RESUME_SESSION]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_RESUME_UI
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_RESUME_UI: IDENTITY_VERIFICATION_RESUME_UI = "IDENTITY_VERIFICATION_RESUME_UI".asInstanceOf[IDENTITY_VERIFICATION_RESUME_UI]
  
  @js.native
  sealed trait IDENTITY_VERIFICATION_START_STEP
    extends StObject
       with EventName
  inline def IDENTITY_VERIFICATION_START_STEP: IDENTITY_VERIFICATION_START_STEP = "IDENTITY_VERIFICATION_START_STEP".asInstanceOf[IDENTITY_VERIFICATION_START_STEP]
  
  @js.native
  sealed trait IE
    extends StObject
       with Country
  inline def IE: IE = "IE".asInstanceOf[IE]
  
  @js.native
  sealed trait INCOMPLETE
    extends StObject
       with TransferStatus
  inline def INCOMPLETE: INCOMPLETE = "INCOMPLETE".asInstanceOf[INCOMPLETE]
  
  @js.native
  sealed trait IT
    extends StObject
       with Country
  inline def IT: IT = "IT".asInstanceOf[IT]
  
  @js.native
  sealed trait KYC_CHECK
    extends StObject
       with ViewName
  inline def KYC_CHECK: KYC_CHECK = "KYC_CHECK".asInstanceOf[KYC_CHECK]
  
  @js.native
  sealed trait LOADING
    extends StObject
       with ViewName
  inline def LOADING: LOADING = "LOADING".asInstanceOf[LOADING]
  
  @js.native
  sealed trait LT
    extends StObject
       with Country
  inline def LT: LT = "LT".asInstanceOf[LT]
  
  @js.native
  sealed trait LV
    extends StObject
       with Country
  inline def LV: LV = "LV".asInstanceOf[LV]
  
  @js.native
  sealed trait MATCHED_CONSENT
    extends StObject
       with ViewName
  inline def MATCHED_CONSENT: MATCHED_CONSENT = "MATCHED_CONSENT".asInstanceOf[MATCHED_CONSENT]
  
  @js.native
  sealed trait MATCHED_CREDENTIAL
    extends StObject
       with ViewName
  inline def MATCHED_CREDENTIAL: MATCHED_CREDENTIAL = "MATCHED_CREDENTIAL".asInstanceOf[MATCHED_CREDENTIAL]
  
  @js.native
  sealed trait MATCHED_MFA
    extends StObject
       with ViewName
  inline def MATCHED_MFA: MATCHED_MFA = "MATCHED_MFA".asInstanceOf[MATCHED_MFA]
  
  @js.native
  sealed trait MATCHED_SELECT_INSTITUTION
    extends StObject
       with EventName
  inline def MATCHED_SELECT_INSTITUTION: MATCHED_SELECT_INSTITUTION = "MATCHED_SELECT_INSTITUTION".asInstanceOf[MATCHED_SELECT_INSTITUTION]
  
  @js.native
  sealed trait MATCHED_SELECT_VERIFY_METHOD
    extends StObject
       with EventName
  inline def MATCHED_SELECT_VERIFY_METHOD: MATCHED_SELECT_VERIFY_METHOD = "MATCHED_SELECT_VERIFY_METHOD".asInstanceOf[MATCHED_SELECT_VERIFY_METHOD]
  
  @js.native
  sealed trait MFA
    extends StObject
       with ViewName
  inline def MFA: MFA = "MFA".asInstanceOf[MFA]
  
  @js.native
  sealed trait NL
    extends StObject
       with Country
  inline def NL: NL = "NL".asInstanceOf[NL]
  
  @js.native
  sealed trait NO
    extends StObject
       with Country
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait NUMBERS
    extends StObject
       with ViewName
  inline def NUMBERS: NUMBERS = "NUMBERS".asInstanceOf[NUMBERS]
  
  @js.native
  sealed trait OAUTH
    extends StObject
       with ViewName
  inline def OAUTH: OAUTH = "OAUTH".asInstanceOf[OAUTH]
  
  @js.native
  sealed trait OPEN
    extends StObject
       with EventName
  inline def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  
  @js.native
  sealed trait OPEN_MY_PLAID
    extends StObject
       with EventName
  inline def OPEN_MY_PLAID: OPEN_MY_PLAID = "OPEN_MY_PLAID".asInstanceOf[OPEN_MY_PLAID]
  
  @js.native
  sealed trait OPEN_OAUTH
    extends StObject
       with EventName
  inline def OPEN_OAUTH: OPEN_OAUTH = "OPEN_OAUTH".asInstanceOf[OPEN_OAUTH]
  
  @js.native
  sealed trait PL
    extends StObject
       with Country
  inline def PL: PL = "PL".asInstanceOf[PL]
  
  @js.native
  sealed trait RECAPTCHA
    extends StObject
       with ViewName
  inline def RECAPTCHA: RECAPTCHA = "RECAPTCHA".asInstanceOf[RECAPTCHA]
  
  @js.native
  sealed trait RISK_CHECK
    extends StObject
       with ViewName
  inline def RISK_CHECK: RISK_CHECK = "RISK_CHECK".asInstanceOf[RISK_CHECK]
  
  @js.native
  sealed trait SCREENING
    extends StObject
       with ViewName
  inline def SCREENING: SCREENING = "SCREENING".asInstanceOf[SCREENING]
  
  @js.native
  sealed trait SE
    extends StObject
       with Country
  inline def SE: SE = "SE".asInstanceOf[SE]
  
  @js.native
  sealed trait SEARCH_INSTITUTION
    extends StObject
       with EventName
  inline def SEARCH_INSTITUTION: SEARCH_INSTITUTION = "SEARCH_INSTITUTION".asInstanceOf[SEARCH_INSTITUTION]
  
  @js.native
  sealed trait SELECT_ACCOUNT
    extends StObject
       with ViewName
  inline def SELECT_ACCOUNT: SELECT_ACCOUNT = "SELECT_ACCOUNT".asInstanceOf[SELECT_ACCOUNT]
  
  @js.native
  sealed trait SELECT_AUTH_TYPE
    extends StObject
       with EventName
       with ViewName
  inline def SELECT_AUTH_TYPE: SELECT_AUTH_TYPE = "SELECT_AUTH_TYPE".asInstanceOf[SELECT_AUTH_TYPE]
  
  @js.native
  sealed trait SELECT_BRAND
    extends StObject
       with EventName
       with ViewName
  inline def SELECT_BRAND: SELECT_BRAND = "SELECT_BRAND".asInstanceOf[SELECT_BRAND]
  
  @js.native
  sealed trait SELECT_DEGRADED_INSTITUTION
    extends StObject
       with EventName
  inline def SELECT_DEGRADED_INSTITUTION: SELECT_DEGRADED_INSTITUTION = "SELECT_DEGRADED_INSTITUTION".asInstanceOf[SELECT_DEGRADED_INSTITUTION]
  
  @js.native
  sealed trait SELECT_DOWN_INSTITUTION
    extends StObject
       with EventName
  inline def SELECT_DOWN_INSTITUTION: SELECT_DOWN_INSTITUTION = "SELECT_DOWN_INSTITUTION".asInstanceOf[SELECT_DOWN_INSTITUTION]
  
  @js.native
  sealed trait SELECT_INSTITUTION
    extends StObject
       with EventName
       with ViewName
  inline def SELECT_INSTITUTION: SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[SELECT_INSTITUTION]
  
  @js.native
  sealed trait SELFIE_CHECK
    extends StObject
       with ViewName
  inline def SELFIE_CHECK: SELFIE_CHECK = "SELFIE_CHECK".asInstanceOf[SELFIE_CHECK]
  
  @js.native
  sealed trait SUBMIT_ACCOUNT_NUMBER
    extends StObject
       with EventName
  inline def SUBMIT_ACCOUNT_NUMBER: SUBMIT_ACCOUNT_NUMBER = "SUBMIT_ACCOUNT_NUMBER".asInstanceOf[SUBMIT_ACCOUNT_NUMBER]
  
  @js.native
  sealed trait SUBMIT_CREDENTIALS
    extends StObject
       with EventName
  inline def SUBMIT_CREDENTIALS: SUBMIT_CREDENTIALS = "SUBMIT_CREDENTIALS".asInstanceOf[SUBMIT_CREDENTIALS]
  
  @js.native
  sealed trait SUBMIT_DOCUMENTS
    extends StObject
       with EventName
  inline def SUBMIT_DOCUMENTS: SUBMIT_DOCUMENTS = "SUBMIT_DOCUMENTS".asInstanceOf[SUBMIT_DOCUMENTS]
  
  @js.native
  sealed trait SUBMIT_DOCUMENTS_ERROR
    extends StObject
       with EventName
  inline def SUBMIT_DOCUMENTS_ERROR: SUBMIT_DOCUMENTS_ERROR = "SUBMIT_DOCUMENTS_ERROR".asInstanceOf[SUBMIT_DOCUMENTS_ERROR]
  
  @js.native
  sealed trait SUBMIT_DOCUMENTS_SUCCESS
    extends StObject
       with EventName
  inline def SUBMIT_DOCUMENTS_SUCCESS: SUBMIT_DOCUMENTS_SUCCESS = "SUBMIT_DOCUMENTS_SUCCESS".asInstanceOf[SUBMIT_DOCUMENTS_SUCCESS]
  
  @js.native
  sealed trait SUBMIT_MFA
    extends StObject
       with EventName
  inline def SUBMIT_MFA: SUBMIT_MFA = "SUBMIT_MFA".asInstanceOf[SUBMIT_MFA]
  
  @js.native
  sealed trait SUBMIT_ROUTING_NUMBER
    extends StObject
       with EventName
  inline def SUBMIT_ROUTING_NUMBER: SUBMIT_ROUTING_NUMBER = "SUBMIT_ROUTING_NUMBER".asInstanceOf[SUBMIT_ROUTING_NUMBER]
  
  @js.native
  sealed trait TRANSITION_VIEW
    extends StObject
       with EventName
  inline def TRANSITION_VIEW: TRANSITION_VIEW = "TRANSITION_VIEW".asInstanceOf[TRANSITION_VIEW]
  
  @js.native
  sealed trait UPLOAD_DOCUMENTS
    extends StObject
       with ViewName
  inline def UPLOAD_DOCUMENTS: UPLOAD_DOCUMENTS = "UPLOAD_DOCUMENTS".asInstanceOf[UPLOAD_DOCUMENTS]
  
  @js.native
  sealed trait US
    extends StObject
       with Country
  inline def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait VERIFY_SMS
    extends StObject
       with ViewName
  inline def VERIFY_SMS: VERIFY_SMS = "VERIFY_SMS".asInstanceOf[VERIFY_SMS]
  
  @js.native
  sealed trait VIEW_DATA_TYPES
    extends StObject
       with EventName
  inline def VIEW_DATA_TYPES: VIEW_DATA_TYPES = "VIEW_DATA_TYPES".asInstanceOf[VIEW_DATA_TYPES]
  
  @js.native
  sealed trait assets
    extends StObject
       with Product
  inline def assets: assets = "assets".asInstanceOf[assets]
  
  @js.native
  sealed trait auth
    extends StObject
       with Product
  inline def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait automatically_verified
    extends StObject
       with VerificationStatus
  inline def automatically_verified: automatically_verified = "automatically_verified".asInstanceOf[automatically_verified]
  
  @js.native
  sealed trait choose_device
    extends StObject
       with ExitStatus
  inline def choose_device: choose_device = "choose_device".asInstanceOf[choose_device]
  
  @js.native
  sealed trait da
    extends StObject
       with Language
  inline def da: da = "da".asInstanceOf[da]
  
  @js.native
  sealed trait de_
    extends StObject
       with Language
  inline def de_ : de_ = "de".asInstanceOf[de_]
  
  @js.native
  sealed trait development
    extends StObject
       with Environment
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait employment
    extends StObject
       with Product
  inline def employment: employment = "employment".asInstanceOf[employment]
  
  @js.native
  sealed trait en
    extends StObject
       with Language
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait es_
    extends StObject
       with Language
  inline def es_ : es_ = "es".asInstanceOf[es_]
  
  @js.native
  sealed trait et
    extends StObject
       with Language
  inline def et: et = "et".asInstanceOf[et]
  
  @js.native
  sealed trait flow_type_instant
    extends StObject
       with AuthTypeSelectFlow
  inline def flow_type_instant: flow_type_instant = "flow_type_instant".asInstanceOf[flow_type_instant]
  
  @js.native
  sealed trait flow_type_manual
    extends StObject
       with AuthTypeSelectFlow
  inline def flow_type_manual: flow_type_manual = "flow_type_manual".asInstanceOf[flow_type_manual]
  
  @js.native
  sealed trait fr_
    extends StObject
       with Language
  inline def fr_ : fr_ = "fr".asInstanceOf[fr_]
  
  @js.native
  sealed trait identity
    extends StObject
       with Product
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait identity_verification
    extends StObject
       with Product
  inline def identity_verification: identity_verification = "identity_verification".asInstanceOf[identity_verification]
  
  @js.native
  sealed trait income
    extends StObject
       with Product
  inline def income: income = "income".asInstanceOf[income]
  
  @js.native
  sealed trait income_verification
    extends StObject
       with Product
  inline def income_verification: income_verification = "income_verification".asInstanceOf[income_verification]
  
  @js.native
  sealed trait institution_not_found
    extends StObject
       with ExitStatus
  inline def institution_not_found: institution_not_found = "institution_not_found".asInstanceOf[institution_not_found]
  
  @js.native
  sealed trait investments
    extends StObject
       with Product
  inline def investments: investments = "investments".asInstanceOf[investments]
  
  @js.native
  sealed trait it_
    extends StObject
       with Language
  inline def it_ : it_ = "it".asInstanceOf[it_]
  
  @js.native
  sealed trait liabilities
    extends StObject
       with Product
  inline def liabilities: liabilities = "liabilities".asInstanceOf[liabilities]
  
  @js.native
  sealed trait lt_
    extends StObject
       with Language
  inline def lt_ : lt_ = "lt".asInstanceOf[lt_]
  
  @js.native
  sealed trait lv_
    extends StObject
       with Language
  inline def lv_ : lv_ = "lv".asInstanceOf[lv_]
  
  @js.native
  sealed trait manually_verified
    extends StObject
       with VerificationStatus
  inline def manually_verified: manually_verified = "manually_verified".asInstanceOf[manually_verified]
  
  @js.native
  sealed trait nl_
    extends StObject
       with Language
  inline def nl_ : nl_ = "nl".asInstanceOf[nl_]
  
  @js.native
  sealed trait no_
    extends StObject
       with Language
  inline def no_ : no_ = "no".asInstanceOf[no_]
  
  @js.native
  sealed trait password
    extends StObject
       with VerificationMethod
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait payment_initiation
    extends StObject
       with Product
  inline def payment_initiation: payment_initiation = "payment_initiation".asInstanceOf[payment_initiation]
  
  @js.native
  sealed trait pending_automatic_verification
    extends StObject
       with VerificationStatus
  inline def pending_automatic_verification: pending_automatic_verification = "pending_automatic_verification".asInstanceOf[pending_automatic_verification]
  
  @js.native
  sealed trait pending_manual_verification
    extends StObject
       with VerificationStatus
  inline def pending_manual_verification: pending_manual_verification = "pending_manual_verification".asInstanceOf[pending_manual_verification]
  
  @js.native
  sealed trait phoneotp
    extends StObject
       with VerificationMethod
  inline def phoneotp: phoneotp = "phoneotp".asInstanceOf[phoneotp]
  
  @js.native
  sealed trait po
    extends StObject
       with Language
  inline def po: po = "po".asInstanceOf[po]
  
  @js.native
  sealed trait production
    extends StObject
       with Environment
  inline def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait requires_account_selection
    extends StObject
       with ExitStatus
  inline def requires_account_selection: requires_account_selection = "requires_account_selection".asInstanceOf[requires_account_selection]
  
  @js.native
  sealed trait requires_code
    extends StObject
       with ExitStatus
  inline def requires_code: requires_code = "requires_code".asInstanceOf[requires_code]
  
  @js.native
  sealed trait requires_credentials
    extends StObject
       with ExitStatus
  inline def requires_credentials: requires_credentials = "requires_credentials".asInstanceOf[requires_credentials]
  
  @js.native
  sealed trait requires_oauth
    extends StObject
       with ExitStatus
  inline def requires_oauth: requires_oauth = "requires_oauth".asInstanceOf[requires_oauth]
  
  @js.native
  sealed trait requires_questions
    extends StObject
       with ExitStatus
  inline def requires_questions: requires_questions = "requires_questions".asInstanceOf[requires_questions]
  
  @js.native
  sealed trait requires_selections
    extends StObject
       with ExitStatus
  inline def requires_selections: requires_selections = "requires_selections".asInstanceOf[requires_selections]
  
  @js.native
  sealed trait ro
    extends StObject
       with Language
  inline def ro: ro = "ro".asInstanceOf[ro]
  
  @js.native
  sealed trait sandbox
    extends StObject
       with Environment
  inline def sandbox: sandbox = "sandbox".asInstanceOf[sandbox]
  
  @js.native
  sealed trait se_
    extends StObject
       with Language
  inline def se_ : se_ = "se".asInstanceOf[se_]
  
  @js.native
  sealed trait standing_orders
    extends StObject
       with Product
  inline def standing_orders: standing_orders = "standing_orders".asInstanceOf[standing_orders]
  
  @js.native
  sealed trait transactions
    extends StObject
       with Product
  inline def transactions: transactions = "transactions".asInstanceOf[transactions]
  
  @js.native
  sealed trait transfer
    extends StObject
       with Product
  inline def transfer: transfer = "transfer".asInstanceOf[transfer]
  
  @js.native
  sealed trait verification_expired
    extends StObject
       with VerificationStatus
  inline def verification_expired: verification_expired = "verification_expired".asInstanceOf[verification_expired]
  
  @js.native
  sealed trait verification_failed
    extends StObject
       with VerificationStatus
  inline def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
}
