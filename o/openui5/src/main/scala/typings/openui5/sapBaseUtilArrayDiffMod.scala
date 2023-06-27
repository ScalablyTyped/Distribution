package typings.openui5

import typings.openui5.anon.Index
import typings.openui5.anon.Replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilArrayDiffMod {
  
  @JSImport("sap/base/util/array/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * Old Array
    */
  aOld: js.Array[Any], /**
    * New Array
    */
  aNew: js.Array[Any]): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(aOld.asInstanceOf[js.Any], aNew.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
  inline def default(
    /**
    * Old Array
    */
  aOld: js.Array[Any],
    /**
    * New Array
    */
  aNew: js.Array[Any],
    /**
    * Configuration object or a function to calculate substitute symbols for array items
    */
  vConfigOrSymbol: js.Function
  ): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(aOld.asInstanceOf[js.Any], aNew.asInstanceOf[js.Any], vConfigOrSymbol.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
  inline def default(
    /**
    * Old Array
    */
  aOld: js.Array[Any],
    /**
    * New Array
    */
  aNew: js.Array[Any],
    /**
    * Configuration object or a function to calculate substitute symbols for array items
    */
  vConfigOrSymbol: Replace
  ): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(aOld.asInstanceOf[js.Any], aNew.asInstanceOf[js.Any], vConfigOrSymbol.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
}
