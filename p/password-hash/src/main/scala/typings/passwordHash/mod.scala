package typings.passwordHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("password-hash", "generate")
  @js.native
  def generate(password: String): String = js.native
  @JSImport("password-hash", "generate")
  @js.native
  def generate(password: String, options: Options): String = js.native
  
  @JSImport("password-hash", "isHashed")
  @js.native
  def isHashed(password: String): Boolean = js.native
  
  @JSImport("password-hash", "verify")
  @js.native
  def verify(password: String, hashedPassword: String): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    var iterations: js.UndefOr[Double] = js.native
    
    var saltLength: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    }
  }
}
