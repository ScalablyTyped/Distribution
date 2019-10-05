package typings.plaidDashLink

import typings.plaidDashLink.plaidDashLinkMod.Plaid.Country
import typings.plaidDashLink.plaidDashLinkMod.Plaid.Environment
import typings.plaidDashLink.plaidDashLinkMod.Plaid.EventName
import typings.plaidDashLink.plaidDashLinkMod.Plaid.ExitStatus
import typings.plaidDashLink.plaidDashLinkMod.Plaid.Language
import typings.plaidDashLink.plaidDashLinkMod.Plaid.Product
import typings.plaidDashLink.plaidDashLinkMod.Plaid.VerificationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object plaidDashLinkStrings {
  @js.native
  sealed trait CA extends Country
  
  @js.native
  sealed trait ERROR extends EventName
  
  @js.native
  sealed trait EXIT extends EventName
  
  @js.native
  sealed trait GB extends Country
  
  @js.native
  sealed trait HANDOFF extends EventName
  
  @js.native
  sealed trait OPEN extends EventName
  
  @js.native
  sealed trait OPEN_MY_PLAID extends EventName
  
  @js.native
  sealed trait SEARCH_INSTITUTION extends EventName
  
  @js.native
  sealed trait SELECT_INSTITUTION extends EventName
  
  @js.native
  sealed trait SUBMIT_CREDENTIALS extends EventName
  
  @js.native
  sealed trait SUBMIT_MFA extends EventName
  
  @js.native
  sealed trait TRANSITION_VIEW extends EventName
  
  @js.native
  sealed trait US extends Country
  
  @js.native
  sealed trait assets extends Product
  
  @js.native
  sealed trait auth extends Product
  
  @js.native
  sealed trait choose_device extends ExitStatus
  
  @js.native
  sealed trait development extends Environment
  
  @js.native
  sealed trait en extends Language
  
  @js.native
  sealed trait es extends Language
  
  @js.native
  sealed trait fr extends Language
  
  @js.native
  sealed trait identity extends Product
  
  @js.native
  sealed trait income extends Product
  
  @js.native
  sealed trait institution_not_found extends ExitStatus
  
  @js.native
  sealed trait investments extends Product
  
  @js.native
  sealed trait liabilities extends Product
  
  @js.native
  sealed trait manually_verified extends VerificationStatus
  
  @js.native
  sealed trait pending_automatic_verification extends VerificationStatus
  
  @js.native
  sealed trait pending_manual_verification extends VerificationStatus
  
  @js.native
  sealed trait production extends Environment
  
  @js.native
  sealed trait requires_code extends ExitStatus
  
  @js.native
  sealed trait requires_credentials extends ExitStatus
  
  @js.native
  sealed trait requires_questions extends ExitStatus
  
  @js.native
  sealed trait requires_selections extends ExitStatus
  
  @js.native
  sealed trait sandbox extends Environment
  
  @js.native
  sealed trait transactions extends Product
  
  @scala.inline
  def CA: CA = "CA".asInstanceOf[CA]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def EXIT: EXIT = "EXIT".asInstanceOf[EXIT]
  @scala.inline
  def GB: GB = "GB".asInstanceOf[GB]
  @scala.inline
  def HANDOFF: HANDOFF = "HANDOFF".asInstanceOf[HANDOFF]
  @scala.inline
  def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  @scala.inline
  def OPEN_MY_PLAID: OPEN_MY_PLAID = "OPEN_MY_PLAID".asInstanceOf[OPEN_MY_PLAID]
  @scala.inline
  def SEARCH_INSTITUTION: SEARCH_INSTITUTION = "SEARCH_INSTITUTION".asInstanceOf[SEARCH_INSTITUTION]
  @scala.inline
  def SELECT_INSTITUTION: SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[SELECT_INSTITUTION]
  @scala.inline
  def SUBMIT_CREDENTIALS: SUBMIT_CREDENTIALS = "SUBMIT_CREDENTIALS".asInstanceOf[SUBMIT_CREDENTIALS]
  @scala.inline
  def SUBMIT_MFA: SUBMIT_MFA = "SUBMIT_MFA".asInstanceOf[SUBMIT_MFA]
  @scala.inline
  def TRANSITION_VIEW: TRANSITION_VIEW = "TRANSITION_VIEW".asInstanceOf[TRANSITION_VIEW]
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  @scala.inline
  def assets: assets = "assets".asInstanceOf[assets]
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  @scala.inline
  def choose_device: choose_device = "choose_device".asInstanceOf[choose_device]
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  @scala.inline
  def income: income = "income".asInstanceOf[income]
  @scala.inline
  def institution_not_found: institution_not_found = "institution_not_found".asInstanceOf[institution_not_found]
  @scala.inline
  def investments: investments = "investments".asInstanceOf[investments]
  @scala.inline
  def liabilities: liabilities = "liabilities".asInstanceOf[liabilities]
  @scala.inline
  def manually_verified: manually_verified = "manually_verified".asInstanceOf[manually_verified]
  @scala.inline
  def pending_automatic_verification: pending_automatic_verification = "pending_automatic_verification".asInstanceOf[pending_automatic_verification]
  @scala.inline
  def pending_manual_verification: pending_manual_verification = "pending_manual_verification".asInstanceOf[pending_manual_verification]
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  @scala.inline
  def requires_code: requires_code = "requires_code".asInstanceOf[requires_code]
  @scala.inline
  def requires_credentials: requires_credentials = "requires_credentials".asInstanceOf[requires_credentials]
  @scala.inline
  def requires_questions: requires_questions = "requires_questions".asInstanceOf[requires_questions]
  @scala.inline
  def requires_selections: requires_selections = "requires_selections".asInstanceOf[requires_selections]
  @scala.inline
  def sandbox: sandbox = "sandbox".asInstanceOf[sandbox]
  @scala.inline
  def transactions: transactions = "transactions".asInstanceOf[transactions]
}

