package typings.plaidLink.mod

import typings.plaidLink.anon.Institutionid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plaid {
  
  @js.native
  trait Account extends StObject {
    
    var id: String = js.native
    
    var mask: String = js.native
    
    var name: String = js.native
    
    var subtype: String = js.native
    
    var `type`: String = js.native
    
    var verification_status: VerificationStatus = js.native
  }
  object Account {
    
    @scala.inline
    def apply(
      id: String,
      mask: String,
      name: String,
      subtype: String,
      `type`: String,
      verification_status: VerificationStatus
    ): Account = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], verification_status = verification_status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    @scala.inline
    implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerification_status(value: VerificationStatus): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.US
    - typings.plaidLink.plaidLinkStrings.CA
    - typings.plaidLink.plaidLinkStrings.GB
  */
  trait Country extends StObject
  object Country {
    
    @scala.inline
    def CA: typings.plaidLink.plaidLinkStrings.CA = "CA".asInstanceOf[typings.plaidLink.plaidLinkStrings.CA]
    
    @scala.inline
    def GB: typings.plaidLink.plaidLinkStrings.GB = "GB".asInstanceOf[typings.plaidLink.plaidLinkStrings.GB]
    
    @scala.inline
    def US: typings.plaidLink.plaidLinkStrings.US = "US".asInstanceOf[typings.plaidLink.plaidLinkStrings.US]
  }
  
  @js.native
  trait CreateConfig extends StObject {
    
    var clientName: String = js.native
    
    var countryCodes: js.UndefOr[js.Array[Country]] = js.native
    
    var env: Environment = js.native
    
    var isWebView: js.UndefOr[Boolean] = js.native
    
    var key: String = js.native
    
    var language: js.UndefOr[Language] = js.native
    
    var linkCustomizationName: js.UndefOr[String] = js.native
    
    var oauthNonce: js.UndefOr[String] = js.native
    
    var oauthRedirectUri: js.UndefOr[String] = js.native
    
    var oauthStateId: js.UndefOr[String] = js.native
    
    var onEvent: js.UndefOr[OnEvent] = js.native
    
    var onExit: js.UndefOr[OnExit] = js.native
    
    var onLoad: js.UndefOr[OnLoad] = js.native
    
    def onSuccess(public_token: String, metadata: OnSuccessMetaData): Unit = js.native
    @JSName("onSuccess")
    var onSuccess_Original: OnSuccess = js.native
    
    var product: js.Array[Product] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var userEmailAddress: js.UndefOr[String] = js.native
    
    var userLegalName: js.UndefOr[String] = js.native
    
    var webhook: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.development
    - typings.plaidLink.plaidLinkStrings.sandbox
    - typings.plaidLink.plaidLinkStrings.production
  */
  trait Environment extends StObject
  object Environment {
    
    @scala.inline
    def development: typings.plaidLink.plaidLinkStrings.development = "development".asInstanceOf[typings.plaidLink.plaidLinkStrings.development]
    
    @scala.inline
    def production: typings.plaidLink.plaidLinkStrings.production = "production".asInstanceOf[typings.plaidLink.plaidLinkStrings.production]
    
    @scala.inline
    def sandbox: typings.plaidLink.plaidLinkStrings.sandbox = "sandbox".asInstanceOf[typings.plaidLink.plaidLinkStrings.sandbox]
  }
  
  @js.native
  trait Error extends StObject {
    
    var display_message: String = js.native
    
    var error_code: String = js.native
    
    var error_message: String = js.native
    
    var error_type: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(display_message: String, error_code: String, error_message: String, error_type: String): Error = {
      val __obj = js.Dynamic.literal(display_message = display_message.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.ERROR
    - typings.plaidLink.plaidLinkStrings.EXIT
    - typings.plaidLink.plaidLinkStrings.HANDOFF
    - typings.plaidLink.plaidLinkStrings.OPEN
    - typings.plaidLink.plaidLinkStrings.OPEN_MY_PLAID
    - typings.plaidLink.plaidLinkStrings.SEARCH_INSTITUTION
    - typings.plaidLink.plaidLinkStrings.SELECT_INSTITUTION
    - typings.plaidLink.plaidLinkStrings.SUBMIT_CREDENTIALS
    - typings.plaidLink.plaidLinkStrings.SUBMIT_MFA
    - typings.plaidLink.plaidLinkStrings.TRANSITION_VIEW
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def ERROR: typings.plaidLink.plaidLinkStrings.ERROR = "ERROR".asInstanceOf[typings.plaidLink.plaidLinkStrings.ERROR]
    
    @scala.inline
    def EXIT: typings.plaidLink.plaidLinkStrings.EXIT = "EXIT".asInstanceOf[typings.plaidLink.plaidLinkStrings.EXIT]
    
    @scala.inline
    def HANDOFF: typings.plaidLink.plaidLinkStrings.HANDOFF = "HANDOFF".asInstanceOf[typings.plaidLink.plaidLinkStrings.HANDOFF]
    
    @scala.inline
    def OPEN: typings.plaidLink.plaidLinkStrings.OPEN = "OPEN".asInstanceOf[typings.plaidLink.plaidLinkStrings.OPEN]
    
    @scala.inline
    def OPEN_MY_PLAID: typings.plaidLink.plaidLinkStrings.OPEN_MY_PLAID = "OPEN_MY_PLAID".asInstanceOf[typings.plaidLink.plaidLinkStrings.OPEN_MY_PLAID]
    
    @scala.inline
    def SEARCH_INSTITUTION: typings.plaidLink.plaidLinkStrings.SEARCH_INSTITUTION = "SEARCH_INSTITUTION".asInstanceOf[typings.plaidLink.plaidLinkStrings.SEARCH_INSTITUTION]
    
    @scala.inline
    def SELECT_INSTITUTION: typings.plaidLink.plaidLinkStrings.SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[typings.plaidLink.plaidLinkStrings.SELECT_INSTITUTION]
    
    @scala.inline
    def SUBMIT_CREDENTIALS: typings.plaidLink.plaidLinkStrings.SUBMIT_CREDENTIALS = "SUBMIT_CREDENTIALS".asInstanceOf[typings.plaidLink.plaidLinkStrings.SUBMIT_CREDENTIALS]
    
    @scala.inline
    def SUBMIT_MFA: typings.plaidLink.plaidLinkStrings.SUBMIT_MFA = "SUBMIT_MFA".asInstanceOf[typings.plaidLink.plaidLinkStrings.SUBMIT_MFA]
    
    @scala.inline
    def TRANSITION_VIEW: typings.plaidLink.plaidLinkStrings.TRANSITION_VIEW = "TRANSITION_VIEW".asInstanceOf[typings.plaidLink.plaidLinkStrings.TRANSITION_VIEW]
  }
  
  @js.native
  trait ExitOptions extends StObject {
    
    var force: Boolean = js.native
  }
  object ExitOptions {
    
    @scala.inline
    def apply(force: Boolean): ExitOptions = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitOptions]
    }
    
    @scala.inline
    implicit class ExitOptionsMutableBuilder[Self <: ExitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.requires_questions
    - typings.plaidLink.plaidLinkStrings.requires_selections
    - typings.plaidLink.plaidLinkStrings.requires_code
    - typings.plaidLink.plaidLinkStrings.choose_device
    - typings.plaidLink.plaidLinkStrings.requires_credentials
    - typings.plaidLink.plaidLinkStrings.institution_not_found
  */
  trait ExitStatus extends StObject
  object ExitStatus {
    
    @scala.inline
    def choose_device: typings.plaidLink.plaidLinkStrings.choose_device = "choose_device".asInstanceOf[typings.plaidLink.plaidLinkStrings.choose_device]
    
    @scala.inline
    def institution_not_found: typings.plaidLink.plaidLinkStrings.institution_not_found = "institution_not_found".asInstanceOf[typings.plaidLink.plaidLinkStrings.institution_not_found]
    
    @scala.inline
    def requires_code: typings.plaidLink.plaidLinkStrings.requires_code = "requires_code".asInstanceOf[typings.plaidLink.plaidLinkStrings.requires_code]
    
    @scala.inline
    def requires_credentials: typings.plaidLink.plaidLinkStrings.requires_credentials = "requires_credentials".asInstanceOf[typings.plaidLink.plaidLinkStrings.requires_credentials]
    
    @scala.inline
    def requires_questions: typings.plaidLink.plaidLinkStrings.requires_questions = "requires_questions".asInstanceOf[typings.plaidLink.plaidLinkStrings.requires_questions]
    
    @scala.inline
    def requires_selections: typings.plaidLink.plaidLinkStrings.requires_selections = "requires_selections".asInstanceOf[typings.plaidLink.plaidLinkStrings.requires_selections]
  }
  
  @js.native
  trait Institution extends StObject {
    
    var auth: Boolean = js.native
    
    var institution_id: String = js.native
    
    var name: String = js.native
    
    var transactions: Boolean = js.native
  }
  object Institution {
    
    @scala.inline
    def apply(auth: Boolean, institution_id: String, name: String, transactions: Boolean): Institution = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institution]
    }
    
    @scala.inline
    implicit class InstitutionMutableBuilder[Self <: Institution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactions(value: Boolean): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.en
    - typings.plaidLink.plaidLinkStrings.fr
    - typings.plaidLink.plaidLinkStrings.es
  */
  trait Language extends StObject
  object Language {
    
    @scala.inline
    def en: typings.plaidLink.plaidLinkStrings.en = "en".asInstanceOf[typings.plaidLink.plaidLinkStrings.en]
    
    @scala.inline
    def es: typings.plaidLink.plaidLinkStrings.es = "es".asInstanceOf[typings.plaidLink.plaidLinkStrings.es]
    
    @scala.inline
    def fr: typings.plaidLink.plaidLinkStrings.fr = "fr".asInstanceOf[typings.plaidLink.plaidLinkStrings.fr]
  }
  
  @js.native
  trait LinkHandler extends StObject {
    
    def destroy(): Unit = js.native
    
    def exit(): Unit = js.native
    def exit(options: ExitOptions): Unit = js.native
    
    var institutions: js.Array[Institution] = js.native
    
    def open(): Unit = js.native
  }
  
  type OnEvent = js.Function2[/* eventName */ EventName, /* metadata */ OnEventMetaData, Unit]
  
  @js.native
  trait OnEventMetaData extends StObject {
    
    var error_code: String = js.native
    
    var error_message: String = js.native
    
    var error_type: String = js.native
    
    var exit_status: ExitStatus = js.native
    
    var institution_id: String = js.native
    
    var institution_name: String = js.native
    
    var institution_search_query: String = js.native
    
    var link_session_id: String = js.native
    
    var mfa_type: String = js.native
    
    var request_id: String = js.native
    
    var timestamp: String = js.native
    
    var view_name: ViewName = js.native
  }
  object OnEventMetaData {
    
    @scala.inline
    def apply(
      error_code: String,
      error_message: String,
      error_type: String,
      exit_status: ExitStatus,
      institution_id: String,
      institution_name: String,
      institution_search_query: String,
      link_session_id: String,
      mfa_type: String,
      request_id: String,
      timestamp: String,
      view_name: ViewName
    ): OnEventMetaData = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], institution_search_query = institution_search_query.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], mfa_type = mfa_type.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], view_name = view_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnEventMetaData]
    }
    
    @scala.inline
    implicit class OnEventMetaDataMutableBuilder[Self <: OnEventMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_status(value: ExitStatus): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_name(value: ViewName): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
    }
  }
  
  type OnExit = js.Function2[/* error */ Error | Null, /* metadata */ OnExitMetaData, Unit]
  
  @js.native
  trait OnExitMetaData extends StObject {
    
    var institution: Institution = js.native
    
    var link_session_id: String = js.native
    
    var request_id: String = js.native
    
    var status: ExitStatus = js.native
  }
  object OnExitMetaData {
    
    @scala.inline
    def apply(institution: Institution, link_session_id: String, request_id: String, status: ExitStatus): OnExitMetaData = {
      val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnExitMetaData]
    }
    
    @scala.inline
    implicit class OnExitMetaDataMutableBuilder[Self <: OnExitMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstitution(value: Institution): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ExitStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type OnLoad = js.Function0[Unit]
  
  type OnSuccess = js.Function2[/* public_token */ String, /* metadata */ OnSuccessMetaData, Unit]
  
  @js.native
  trait OnSuccessMetaData extends StObject {
    
    var accounts: js.Array[Account] = js.native
    
    var institution: Institutionid = js.native
    
    var link_session_id: String = js.native
  }
  object OnSuccessMetaData {
    
    @scala.inline
    def apply(accounts: js.Array[Account], institution: Institutionid, link_session_id: String): OnSuccessMetaData = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSuccessMetaData]
    }
    
    @scala.inline
    implicit class OnSuccessMetaDataMutableBuilder[Self <: OnSuccessMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      @scala.inline
      def setInstitution(value: Institutionid): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.transactions
    - typings.plaidLink.plaidLinkStrings.auth
    - typings.plaidLink.plaidLinkStrings.identity
    - typings.plaidLink.plaidLinkStrings.income
    - typings.plaidLink.plaidLinkStrings.assets
    - typings.plaidLink.plaidLinkStrings.investments
    - typings.plaidLink.plaidLinkStrings.liabilities
  */
  trait Product extends StObject
  object Product {
    
    @scala.inline
    def assets: typings.plaidLink.plaidLinkStrings.assets = "assets".asInstanceOf[typings.plaidLink.plaidLinkStrings.assets]
    
    @scala.inline
    def auth: typings.plaidLink.plaidLinkStrings.auth = "auth".asInstanceOf[typings.plaidLink.plaidLinkStrings.auth]
    
    @scala.inline
    def identity: typings.plaidLink.plaidLinkStrings.identity = "identity".asInstanceOf[typings.plaidLink.plaidLinkStrings.identity]
    
    @scala.inline
    def income: typings.plaidLink.plaidLinkStrings.income = "income".asInstanceOf[typings.plaidLink.plaidLinkStrings.income]
    
    @scala.inline
    def investments: typings.plaidLink.plaidLinkStrings.investments = "investments".asInstanceOf[typings.plaidLink.plaidLinkStrings.investments]
    
    @scala.inline
    def liabilities: typings.plaidLink.plaidLinkStrings.liabilities = "liabilities".asInstanceOf[typings.plaidLink.plaidLinkStrings.liabilities]
    
    @scala.inline
    def transactions: typings.plaidLink.plaidLinkStrings.transactions = "transactions".asInstanceOf[typings.plaidLink.plaidLinkStrings.transactions]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.pending_automatic_verification
    - typings.plaidLink.plaidLinkStrings.pending_manual_verification
    - typings.plaidLink.plaidLinkStrings.manually_verified
  */
  trait VerificationStatus extends StObject
  object VerificationStatus {
    
    @scala.inline
    def manually_verified: typings.plaidLink.plaidLinkStrings.manually_verified = "manually_verified".asInstanceOf[typings.plaidLink.plaidLinkStrings.manually_verified]
    
    @scala.inline
    def pending_automatic_verification: typings.plaidLink.plaidLinkStrings.pending_automatic_verification = "pending_automatic_verification".asInstanceOf[typings.plaidLink.plaidLinkStrings.pending_automatic_verification]
    
    @scala.inline
    def pending_manual_verification: typings.plaidLink.plaidLinkStrings.pending_manual_verification = "pending_manual_verification".asInstanceOf[typings.plaidLink.plaidLinkStrings.pending_manual_verification]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plaidLink.plaidLinkStrings.CONNECTED
    - typings.plaidLink.plaidLinkStrings.CREDENTIAL
    - typings.plaidLink.plaidLinkStrings.ERROR
    - typings.plaidLink.plaidLinkStrings.EXIT
    - typings.plaidLink.plaidLinkStrings.LOADING
    - typings.plaidLink.plaidLinkStrings.MFA
    - typings.plaidLink.plaidLinkStrings.NUMBERS
    - typings.plaidLink.plaidLinkStrings.RECAPTCHA
    - typings.plaidLink.plaidLinkStrings.SELECT_ACCOUNT
    - typings.plaidLink.plaidLinkStrings.SELECT_INSTITUTION
  */
  trait ViewName extends StObject
  object ViewName {
    
    @scala.inline
    def CONNECTED: typings.plaidLink.plaidLinkStrings.CONNECTED = "CONNECTED".asInstanceOf[typings.plaidLink.plaidLinkStrings.CONNECTED]
    
    @scala.inline
    def CREDENTIAL: typings.plaidLink.plaidLinkStrings.CREDENTIAL = "CREDENTIAL".asInstanceOf[typings.plaidLink.plaidLinkStrings.CREDENTIAL]
    
    @scala.inline
    def ERROR: typings.plaidLink.plaidLinkStrings.ERROR = "ERROR".asInstanceOf[typings.plaidLink.plaidLinkStrings.ERROR]
    
    @scala.inline
    def EXIT: typings.plaidLink.plaidLinkStrings.EXIT = "EXIT".asInstanceOf[typings.plaidLink.plaidLinkStrings.EXIT]
    
    @scala.inline
    def LOADING: typings.plaidLink.plaidLinkStrings.LOADING = "LOADING".asInstanceOf[typings.plaidLink.plaidLinkStrings.LOADING]
    
    @scala.inline
    def MFA: typings.plaidLink.plaidLinkStrings.MFA = "MFA".asInstanceOf[typings.plaidLink.plaidLinkStrings.MFA]
    
    @scala.inline
    def NUMBERS: typings.plaidLink.plaidLinkStrings.NUMBERS = "NUMBERS".asInstanceOf[typings.plaidLink.plaidLinkStrings.NUMBERS]
    
    @scala.inline
    def RECAPTCHA: typings.plaidLink.plaidLinkStrings.RECAPTCHA = "RECAPTCHA".asInstanceOf[typings.plaidLink.plaidLinkStrings.RECAPTCHA]
    
    @scala.inline
    def SELECT_ACCOUNT: typings.plaidLink.plaidLinkStrings.SELECT_ACCOUNT = "SELECT_ACCOUNT".asInstanceOf[typings.plaidLink.plaidLinkStrings.SELECT_ACCOUNT]
    
    @scala.inline
    def SELECT_INSTITUTION: typings.plaidLink.plaidLinkStrings.SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[typings.plaidLink.plaidLinkStrings.SELECT_INSTITUTION]
  }
}
