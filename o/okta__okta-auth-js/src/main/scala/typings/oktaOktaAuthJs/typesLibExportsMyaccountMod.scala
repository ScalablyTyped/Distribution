package typings.oktaOktaAuthJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibExportsMyaccountMod {
  
  @JSImport("@okta/okta-auth-js/types/lib/exports/myaccount", JSImport.Default)
  @js.native
  open class default protected () extends OktaAuth {
    def this(options: OktaAuthOptions) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_common.OktaAuthConstructor<imported_myaccount.OktaAuthMyAccountInterface<imported_common.PKCETransactionMeta, CoreStorageManagerInterface<imported_common.PKCETransactionMeta>, OktaAuthOptions>> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_common.OktaAuthConstructor<imported_myaccount.OktaAuthMyAccountInterface<imported_common.PKCETransactionMeta, CoreStorageManagerInterface<imported_common.PKCETransactionMeta>, OktaAuthOptions>> * / any */ @JSImport("@okta/okta-auth-js/types/lib/exports/myaccount", "OktaAuth")
  @js.native
  open class OktaAuth protected () extends StObject {
    def this(options: OktaAuthOptions) = this()
  }
  
  type OktaAuthOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OktaAuthCoreOptions */ Any
}
