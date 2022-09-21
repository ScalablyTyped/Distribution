package typings.preact.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentClass[P, S]
  extends StObject
     with Instantiable1[/* props */ P, Component[P, S]]
     with Instantiable2[/* props */ P, /* context */ Any, Component[P, S]] {
  
  var contextType: js.UndefOr[Context[Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ Any, Partial[S] | Null]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ P, /* state */ S, Partial[S] | Null]] = js.native
}
