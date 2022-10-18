package typings.mobx

import typings.mobx.distCoreDerivationMod.IDerivation
import typings.mobx.distCoreDerivationMod.IDerivationState
import typings.mobx.distCoreObservableMod.IObservable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreAtomMod {
  
  @JSImport("mobx/dist/core/atom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/core/atom", "Atom")
  @js.native
  /**
    * Create a new atom. For debugging purposes it is recommended to give it a name.
    * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
    */
  open class Atom ()
    extends StObject
       with IAtom {
    def this(name_ : String) = this()
    
    /* CompleteClass */
    var diffValue_ : Double = js.native
    
    /* CompleteClass */
    var isBeingObserved_ : Boolean = js.native
    
    /* CompleteClass */
    var isPendingUnobservation_ : Boolean = js.native
    
    /**
      * Id of the derivation *run* that last accessed this observable.
      * If this id equals the *run* id of the current derivation,
      * the dependency is already established
      */
    /* CompleteClass */
    var lastAccessedBy_ : Double = js.native
    
    /* CompleteClass */
    var lowestObserverState_ : IDerivationState = js.native
    
    /* CompleteClass */
    var name_ : String = js.native
    
    /* CompleteClass */
    var observers_ : Set[IDerivation] = js.native
    
    /* CompleteClass */
    override def onBO(): Unit = js.native
    
    /* CompleteClass */
    override def onBUO(): Unit = js.native
    
    /* CompleteClass */
    override def reportChanged(): Any = js.native
    
    /* CompleteClass */
    override def reportObserved(): Boolean = js.native
  }
  
  inline def createAtom(name: String): IAtom = ^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any]).asInstanceOf[IAtom]
  inline def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  inline def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  inline def createAtom(name: String, onBecomeObservedHandler: Unit, onBecomeUnobservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  
  inline def isAtom(x: Any): /* is mobx.mobx/dist/core/atom.Atom */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtom")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/core/atom.Atom */ Boolean]
  
  @JSImport("mobx/dist/core/atom", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  trait IAtom
    extends StObject
       with IObservable {
    
    def reportChanged(): Any
    
    def reportObserved(): Boolean
  }
  object IAtom {
    
    inline def apply(
      diffValue_ : Double,
      isBeingObserved_ : Boolean,
      isPendingUnobservation_ : Boolean,
      lastAccessedBy_ : Double,
      lowestObserverState_ : IDerivationState,
      name_ : String,
      observers_ : Set[IDerivation],
      onBO: () => Unit,
      onBUO: () => Unit,
      reportChanged: () => Any,
      reportObserved: () => Boolean
    ): IAtom = {
      val __obj = js.Dynamic.literal(diffValue_ = diffValue_.asInstanceOf[js.Any], isBeingObserved_ = isBeingObserved_.asInstanceOf[js.Any], isPendingUnobservation_ = isPendingUnobservation_.asInstanceOf[js.Any], lastAccessedBy_ = lastAccessedBy_.asInstanceOf[js.Any], lowestObserverState_ = lowestObserverState_.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], observers_ = observers_.asInstanceOf[js.Any], onBO = js.Any.fromFunction0(onBO), onBUO = js.Any.fromFunction0(onBUO), reportChanged = js.Any.fromFunction0(reportChanged), reportObserved = js.Any.fromFunction0(reportObserved))
      __obj.asInstanceOf[IAtom]
    }
    
    extension [Self <: IAtom](x: Self) {
      
      inline def setReportChanged(value: () => Any): Self = StObject.set(x, "reportChanged", js.Any.fromFunction0(value))
      
      inline def setReportObserved(value: () => Boolean): Self = StObject.set(x, "reportObserved", js.Any.fromFunction0(value))
    }
  }
}
