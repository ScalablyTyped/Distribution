package typings.plaidLink

import typings.plaidLink.mod.Plaid.Country
import typings.plaidLink.mod.Plaid.Environment
import typings.plaidLink.mod.Plaid.EventName
import typings.plaidLink.mod.Plaid.ExitStatus
import typings.plaidLink.mod.Plaid.Language
import typings.plaidLink.mod.Plaid.Product
import typings.plaidLink.mod.Plaid.VerificationStatus
import typings.plaidLink.mod.Plaid.ViewName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plaidLinkStrings {
  
  @js.native
  sealed trait CA
    extends StObject
       with Country
  @scala.inline
  def CA: CA = "CA".asInstanceOf[CA]
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ViewName
  @scala.inline
  def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @js.native
  sealed trait CREDENTIAL
    extends StObject
       with ViewName
  @scala.inline
  def CREDENTIAL: CREDENTIAL = "CREDENTIAL".asInstanceOf[CREDENTIAL]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with EventName
       with ViewName
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait EXIT
    extends StObject
       with EventName
       with ViewName
  @scala.inline
  def EXIT: EXIT = "EXIT".asInstanceOf[EXIT]
  
  @js.native
  sealed trait GB
    extends StObject
       with Country
  @scala.inline
  def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait HANDOFF
    extends StObject
       with EventName
  @scala.inline
  def HANDOFF: HANDOFF = "HANDOFF".asInstanceOf[HANDOFF]
  
  @js.native
  sealed trait LOADING
    extends StObject
       with ViewName
  @scala.inline
  def LOADING: LOADING = "LOADING".asInstanceOf[LOADING]
  
  @js.native
  sealed trait MFA
    extends StObject
       with ViewName
  @scala.inline
  def MFA: MFA = "MFA".asInstanceOf[MFA]
  
  @js.native
  sealed trait NUMBERS
    extends StObject
       with ViewName
  @scala.inline
  def NUMBERS: NUMBERS = "NUMBERS".asInstanceOf[NUMBERS]
  
  @js.native
  sealed trait OPEN
    extends StObject
       with EventName
  @scala.inline
  def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  
  @js.native
  sealed trait OPEN_MY_PLAID
    extends StObject
       with EventName
  @scala.inline
  def OPEN_MY_PLAID: OPEN_MY_PLAID = "OPEN_MY_PLAID".asInstanceOf[OPEN_MY_PLAID]
  
  @js.native
  sealed trait RECAPTCHA
    extends StObject
       with ViewName
  @scala.inline
  def RECAPTCHA: RECAPTCHA = "RECAPTCHA".asInstanceOf[RECAPTCHA]
  
  @js.native
  sealed trait SEARCH_INSTITUTION
    extends StObject
       with EventName
  @scala.inline
  def SEARCH_INSTITUTION: SEARCH_INSTITUTION = "SEARCH_INSTITUTION".asInstanceOf[SEARCH_INSTITUTION]
  
  @js.native
  sealed trait SELECT_ACCOUNT
    extends StObject
       with ViewName
  @scala.inline
  def SELECT_ACCOUNT: SELECT_ACCOUNT = "SELECT_ACCOUNT".asInstanceOf[SELECT_ACCOUNT]
  
  @js.native
  sealed trait SELECT_INSTITUTION
    extends StObject
       with EventName
       with ViewName
  @scala.inline
  def SELECT_INSTITUTION: SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[SELECT_INSTITUTION]
  
  @js.native
  sealed trait SUBMIT_CREDENTIALS
    extends StObject
       with EventName
  @scala.inline
  def SUBMIT_CREDENTIALS: SUBMIT_CREDENTIALS = "SUBMIT_CREDENTIALS".asInstanceOf[SUBMIT_CREDENTIALS]
  
  @js.native
  sealed trait SUBMIT_MFA
    extends StObject
       with EventName
  @scala.inline
  def SUBMIT_MFA: SUBMIT_MFA = "SUBMIT_MFA".asInstanceOf[SUBMIT_MFA]
  
  @js.native
  sealed trait TRANSITION_VIEW
    extends StObject
       with EventName
  @scala.inline
  def TRANSITION_VIEW: TRANSITION_VIEW = "TRANSITION_VIEW".asInstanceOf[TRANSITION_VIEW]
  
  @js.native
  sealed trait US
    extends StObject
       with Country
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait assets
    extends StObject
       with Product
  @scala.inline
  def assets: assets = "assets".asInstanceOf[assets]
  
  @js.native
  sealed trait auth
    extends StObject
       with Product
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait choose_device
    extends StObject
       with ExitStatus
  @scala.inline
  def choose_device: choose_device = "choose_device".asInstanceOf[choose_device]
  
  @js.native
  sealed trait development
    extends StObject
       with Environment
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait en
    extends StObject
       with Language
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait es
    extends StObject
       with Language
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait fr
    extends StObject
       with Language
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait identity
    extends StObject
       with Product
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait income
    extends StObject
       with Product
  @scala.inline
  def income: income = "income".asInstanceOf[income]
  
  @js.native
  sealed trait institution_not_found
    extends StObject
       with ExitStatus
  @scala.inline
  def institution_not_found: institution_not_found = "institution_not_found".asInstanceOf[institution_not_found]
  
  @js.native
  sealed trait investments
    extends StObject
       with Product
  @scala.inline
  def investments: investments = "investments".asInstanceOf[investments]
  
  @js.native
  sealed trait liabilities
    extends StObject
       with Product
  @scala.inline
  def liabilities: liabilities = "liabilities".asInstanceOf[liabilities]
  
  @js.native
  sealed trait manually_verified
    extends StObject
       with VerificationStatus
  @scala.inline
  def manually_verified: manually_verified = "manually_verified".asInstanceOf[manually_verified]
  
  @js.native
  sealed trait pending_automatic_verification
    extends StObject
       with VerificationStatus
  @scala.inline
  def pending_automatic_verification: pending_automatic_verification = "pending_automatic_verification".asInstanceOf[pending_automatic_verification]
  
  @js.native
  sealed trait pending_manual_verification
    extends StObject
       with VerificationStatus
  @scala.inline
  def pending_manual_verification: pending_manual_verification = "pending_manual_verification".asInstanceOf[pending_manual_verification]
  
  @js.native
  sealed trait production
    extends StObject
       with Environment
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait requires_code
    extends StObject
       with ExitStatus
  @scala.inline
  def requires_code: requires_code = "requires_code".asInstanceOf[requires_code]
  
  @js.native
  sealed trait requires_credentials
    extends StObject
       with ExitStatus
  @scala.inline
  def requires_credentials: requires_credentials = "requires_credentials".asInstanceOf[requires_credentials]
  
  @js.native
  sealed trait requires_questions
    extends StObject
       with ExitStatus
  @scala.inline
  def requires_questions: requires_questions = "requires_questions".asInstanceOf[requires_questions]
  
  @js.native
  sealed trait requires_selections
    extends StObject
       with ExitStatus
  @scala.inline
  def requires_selections: requires_selections = "requires_selections".asInstanceOf[requires_selections]
  
  @js.native
  sealed trait sandbox
    extends StObject
       with Environment
  @scala.inline
  def sandbox: sandbox = "sandbox".asInstanceOf[sandbox]
  
  @js.native
  sealed trait transactions
    extends StObject
       with Product
  @scala.inline
  def transactions: transactions = "transactions".asInstanceOf[transactions]
}
