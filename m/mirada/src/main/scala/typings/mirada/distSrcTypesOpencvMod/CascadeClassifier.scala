package typings.mirada.distSrcTypesOpencvMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv", "CascadeClassifier")
@js.native
open class CascadeClassifier ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.CascadeClassifier {
  /**
    * @param filename Name of the file from which the classifier is loaded.
    */
  def this(filename: String) = this()
}
/* static members */
object CascadeClassifier {
  
  @JSImport("mirada/dist/src/types/opencv", "CascadeClassifier")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(oldcascade: String, newcascade: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(oldcascade.asInstanceOf[js.Any], newcascade.asInstanceOf[js.Any])).asInstanceOf[String]
}
