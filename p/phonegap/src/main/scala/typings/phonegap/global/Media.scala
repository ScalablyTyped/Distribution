package typings.phonegap.global

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Media")
@js.native
class Media protected ()
  extends typings.phonegap.Media {
  def this(
    src: String,
    onSuccess: js.Function1[/* arg */ js.Any, _],
    onError: js.Function1[/* error */ js.Any, _]
  ) = this()
}
@JSGlobal("Media")
@js.native
object Media
  extends Instantiable3[
      /* src */ String, 
      /* onSuccess */ js.Function1[/* arg */ js.Any, js.Any], 
      /* onError */ js.Function1[/* error */ js.Any, js.Any], 
      typings.phonegap.Media
    ]
