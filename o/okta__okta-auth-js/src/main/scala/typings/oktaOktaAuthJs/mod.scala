package typings.oktaOktaAuthJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@okta/okta-auth-js", JSImport.Default)
  @js.native
  open class default protected () extends OktaAuth {
    def this(options: OktaAuthOptions) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_idx.OktaAuthIdxConstructor<imported_idx.OktaAuthIdxInterface<imported_idx.IdxTransactionMeta, imported_idx.IdxStorageManagerInterface<imported_idx.IdxTransactionMeta>, OktaAuthOptions, imported_idx.IdxTransactionManagerInterface> & imported_common.OktaAuthCoreInterface<imported_idx.IdxTransactionMeta, imported_idx.IdxStorageManagerInterface<imported_idx.IdxTransactionMeta>, OktaAuthOptions, imported_idx.IdxTransactionManagerInterface>> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_idx.OktaAuthIdxConstructor<imported_idx.OktaAuthIdxInterface<imported_idx.IdxTransactionMeta, imported_idx.IdxStorageManagerInterface<imported_idx.IdxTransactionMeta>, OktaAuthOptions, imported_idx.IdxTransactionManagerInterface> & imported_common.OktaAuthCoreInterface<imported_idx.IdxTransactionMeta, imported_idx.IdxStorageManagerInterface<imported_idx.IdxTransactionMeta>, OktaAuthOptions, imported_idx.IdxTransactionManagerInterface>> * / any */ @JSImport("@okta/okta-auth-js", "OktaAuth")
  @js.native
  open class OktaAuth protected () extends StObject {
    def this(options: OktaAuthOptions) = this()
  }
  
  type OktaAuthOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OktaAuthIdxOptions */ Any
}
