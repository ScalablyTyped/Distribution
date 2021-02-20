package typings.mobx

import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atomMod {
  
  @JSImport("mobx/lib/core/atom", "Atom")
  @js.native
  /**
    * Create a new atom. For debugging purposes it is recommended to give it a name.
    * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
    */
  class Atom () extends IAtom {
    def this(name: String) = this()
  }
  
  @JSImport("mobx/lib/core/atom", "createAtom")
  @js.native
  def createAtom(name: String): IAtom = js.native
  @JSImport("mobx/lib/core/atom", "createAtom")
  @js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.UndefOr[scala.Nothing],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  @JSImport("mobx/lib/core/atom", "createAtom")
  @js.native
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  @JSImport("mobx/lib/core/atom", "createAtom")
  @js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  
  @JSImport("mobx/lib/core/atom", "isAtom")
  @js.native
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ Boolean = js.native
  
  @JSImport("mobx/lib/core/atom", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  @js.native
  trait IAtom extends IObservable {
    
    def reportChanged(): js.Any = js.native
    
    def reportObserved(): js.Any = js.native
  }
  object IAtom {
    
    @scala.inline
    def apply(
      diffValue: Double,
      isBeingObserved: Boolean,
      isPendingUnobservation: Boolean,
      lastAccessedBy: Double,
      lowestObserverState: IDerivationState,
      name: String,
      observers: Set[IDerivation],
      onBecomeObserved: () => Unit,
      onBecomeUnobserved: () => Unit,
      reportChanged: () => js.Any,
      reportObserved: () => js.Any
    ): IAtom = {
      val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved), reportChanged = js.Any.fromFunction0(reportChanged), reportObserved = js.Any.fromFunction0(reportObserved))
      __obj.asInstanceOf[IAtom]
    }
    
    @scala.inline
    implicit class IAtomMutableBuilder[Self <: IAtom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportChanged(value: () => js.Any): Self = StObject.set(x, "reportChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReportObserved(value: () => js.Any): Self = StObject.set(x, "reportObserved", js.Any.fromFunction0(value))
    }
  }
}
