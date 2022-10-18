package typings.nextAuth

import typings.nextAuth.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibUtilsMod {
  
  @JSImport("next-auth/core/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSecret(params: Url): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecret")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromDate(time: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def fromDate(time: Double, date: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(time.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def hashToken(
    token: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'email'> */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashToken")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
