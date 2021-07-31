package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionManagerMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", "Transaction")
  @js.native
  class Transaction protected () extends StObject {
    def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
    
    var checkTransaction: js.Any = js.native
    
    def commit(): Unit = js.native
    
    def rollback(): Unit = js.native
    
    var transactionManager: js.Any = js.native
    
    val transactionType: TransactionType = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", "TransactionManager")
  @js.native
  class TransactionManager protected () extends StObject {
    def this(model: AbstractModel, errorCallback: IErrorCallback) = this()
    
    var beginImplicitTransaction: js.Any = js.native
    
    def beginTransaction(): Transaction = js.native
    def beginTransaction(commitCurrentImplicitTransaction: Boolean): Transaction = js.native
    
    var checkModel: js.Any = js.native
    
    def commit(): Unit = js.native
    
    var currentTransaction: Transaction | Null = js.native
    
    def deltaReceived(delta: Delta): Unit = js.native
    
    var detachedRequiredProperties: js.Any = js.native
    
    var errorCallback: js.Any = js.native
    
    var eventEmitter: js.Any = js.native
    
    var model: js.Any = js.native
    
    def onCommitted(callback: js.Function0[Unit]): Unit = js.native
    
    def onRollback(callback: js.Function0[Unit]): Unit = js.native
    
    def rollback(): Unit = js.native
  }
  
  @scala.inline
  def beginTransaction(model: IAbstractModel): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  @scala.inline
  def beginTransaction(model: IAbstractModel, options: ITransactionOptions): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  @scala.inline
  def runInTransaction[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def runInTransaction[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def runInTransaction_T_T[T](model: IAbstractModel, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def runInTransaction_T_T[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait ITransactionOptions extends StObject {
    
    var commitCurrentImplicitTransaction: Boolean
  }
  object ITransactionOptions {
    
    @scala.inline
    def apply(commitCurrentImplicitTransaction: Boolean): ITransactionOptions = {
      val __obj = js.Dynamic.literal(commitCurrentImplicitTransaction = commitCurrentImplicitTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransactionOptions]
    }
    
    @scala.inline
    implicit class ITransactionOptionsMutableBuilder[Self <: ITransactionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommitCurrentImplicitTransaction(value: Boolean): Self = StObject.set(x, "commitCurrentImplicitTransaction", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.mendixmodelsdkStrings.explicit
    - typings.mendixmodelsdk.mendixmodelsdkStrings.`implicit`
  */
  trait TransactionType extends StObject
  object TransactionType {
    
    @scala.inline
    def explicit: typings.mendixmodelsdk.mendixmodelsdkStrings.explicit = "explicit".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.explicit]
    
    @scala.inline
    def `implicit`: typings.mendixmodelsdk.mendixmodelsdkStrings.`implicit` = "implicit".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.`implicit`]
  }
}
