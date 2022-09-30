package typings.omitDeepLodash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: js.Object, props: String*): js.Object = ^.asInstanceOf[js.Dynamic].apply(scala.List(input.asInstanceOf[js.Any]).`++`(props.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  inline def apply(input: js.Object, props: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSImport("omit-deep-lodash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
