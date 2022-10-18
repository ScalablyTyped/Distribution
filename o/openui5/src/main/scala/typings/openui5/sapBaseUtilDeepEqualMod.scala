package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilDeepEqualMod {
  
  @JSImport("sap/base/util/deepEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * A value of any type
    */
  a: Any, /**
    * A value of any type
    */
  b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    /**
    * A value of any type
    */
  a: Any,
    /**
    * A value of any type
    */
  b: Any,
    /**
    * Maximum recursion depth
    */
  maxDepth: Unit,
    /**
    * Whether all existing properties in a are equal as in b
    */
  contains: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], contains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    /**
    * A value of any type
    */
  a: Any,
    /**
    * A value of any type
    */
  b: Any,
    /**
    * Maximum recursion depth
    */
  maxDepth: int
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    /**
    * A value of any type
    */
  a: Any,
    /**
    * A value of any type
    */
  b: Any,
    /**
    * Maximum recursion depth
    */
  maxDepth: int,
    /**
    * Whether all existing properties in a are equal as in b
    */
  contains: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], contains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
