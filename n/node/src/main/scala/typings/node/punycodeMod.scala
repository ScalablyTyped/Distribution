package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object punycodeMod {
  
  @JSImport("punycode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  @scala.inline
  def decode(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  @scala.inline
  def encode(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  @scala.inline
  def toASCII(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  @scala.inline
  def toUnicode(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  trait ucs2 extends StObject {
    
    /**
      * @deprecated since v7.0.0
      * The version of the punycode module bundled in Node.js is being deprecated.
      * In a future major version of Node.js this module will be removed.
      * Users currently depending on the punycode module should switch to using
      * the userland-provided Punycode.js module instead.
      */
    def decode(string: java.lang.String): js.Array[Double]
    
    /**
      * @deprecated since v7.0.0
      * The version of the punycode module bundled in Node.js is being deprecated.
      * In a future major version of Node.js this module will be removed.
      * Users currently depending on the punycode module should switch to using
      * the userland-provided Punycode.js module instead.
      */
    def encode(codePoints: js.Array[Double]): java.lang.String
  }
  object ucs2 {
    
    /**
      * @deprecated since v7.0.0
      * The version of the punycode module bundled in Node.js is being deprecated.
      * In a future major version of Node.js this module will be removed.
      * Users currently depending on the punycode module should switch to using
      * the userland-provided Punycode.js module instead.
      */
    @JSImport("punycode", "ucs2")
    @js.native
    val ^ : ucs2 = js.native
    
    @scala.inline
    implicit class ucs2MutableBuilder[Self <: ucs2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: java.lang.String => js.Array[Double]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Array[Double] => java.lang.String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  @JSImport("punycode", "version")
  @js.native
  val version: java.lang.String = js.native
}
