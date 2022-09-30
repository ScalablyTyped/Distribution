package typings.orbitUiReactComponents

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `match`[TReturnValue](
    value: String,
    lookup: Record[String, TReturnValue | (js.Function1[/* repeated */ Any, TReturnValue])],
    args: Any*
  ): TReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("match")((scala.List(value.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[TReturnValue]
  inline def `match`[TReturnValue](
    value: Double,
    lookup: Record[Double, TReturnValue | (js.Function1[/* repeated */ Any, TReturnValue])],
    args: Any*
  ): TReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("match")((scala.List(value.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[TReturnValue]
}
