package typings.ow

import typings.ow.basePredicateMod.BasePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  @JSImport("ow/dist/test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: T, label: String, predicate: BasePredicate[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](value: T, label: String, predicate: BasePredicate[T], idLabel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], idLabel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](value: T, label: js.Function, predicate: BasePredicate[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](value: T, label: js.Function, predicate: BasePredicate[T], idLabel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], label.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], idLabel.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
