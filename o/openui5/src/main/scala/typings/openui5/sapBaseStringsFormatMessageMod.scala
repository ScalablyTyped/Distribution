package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseStringsFormatMessageMod {
  
  @JSImport("sap/base/strings/formatMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * A pattern string in the described syntax
    */
  sPattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sPattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(
    /**
    * A pattern string in the described syntax
    */
  sPattern: String,
    /**
    * The values to be used instead of the placeholders.
    */
  aValues: js.Array[Any]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sPattern.asInstanceOf[js.Any], aValues.asInstanceOf[js.Any])).asInstanceOf[String]
}
