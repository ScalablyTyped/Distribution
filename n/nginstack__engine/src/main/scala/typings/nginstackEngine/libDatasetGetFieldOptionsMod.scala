package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetGetFieldOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/GetFieldOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GetFieldOptions
  @JSImport("@nginstack/engine/lib/dataset/GetFieldOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/GetFieldOptions", "BEFORE_VALUE")
  @js.native
  val BEFORE_VALUE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/GetFieldOptions", "IGNORE_FIELD_NOT_FOUND")
  @js.native
  val IGNORE_FIELD_NOT_FOUND: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/GetFieldOptions", "ORIGINAL_VALUE")
  @js.native
  val ORIGINAL_VALUE: Double = js.native
  
  trait GetFieldOptions extends StObject
}
