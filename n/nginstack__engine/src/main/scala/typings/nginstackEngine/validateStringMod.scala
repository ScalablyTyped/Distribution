package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateStringMod {
  
  inline def apply(
    value: Any,
    `type`: Any,
    max: js.UndefOr[Double | js.Date],
    min: js.UndefOr[Double | js.Date],
    caseType: js.UndefOr[String],
    classKey: js.UndefOr[Double],
    dateFormat: js.UndefOr[Any],
    args: Any*
  ): Any = (^.asInstanceOf[js.Dynamic].apply((List(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], max.asInstanceOf[js.Any], min.asInstanceOf[js.Any], caseType.asInstanceOf[js.Any], classKey.asInstanceOf[js.Any], dateFormat.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/string/validateString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerType(`type`: String, handler: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerType(`type`: js.Array[String], handler: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
