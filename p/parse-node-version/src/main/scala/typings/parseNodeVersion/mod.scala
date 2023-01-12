package typings.parseNodeVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Takes a Node version string (usually `process.version`) and returns an object
    * with the `major`/`minor`/`patch` (which will all be numbers) and `pre`/`build`
    * keys (which will always be a string). If the version doesn't contain any
    * pre-release or build information, the properties will be returned
    * as empty string.
    *
    * @param nodeVersionString Node version string
    */
  inline def apply(nodeVersionString: String): ParsedNodeVersion = ^.asInstanceOf[js.Dynamic].apply(nodeVersionString.asInstanceOf[js.Any]).asInstanceOf[ParsedNodeVersion]
  
  @JSImport("parse-node-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParsedNodeVersion extends StObject {
    
    /**
      * Build information
      */
    var build: String
    
    /**
      * Major version
      */
    var major: Double
    
    /**
      * Minor version
      */
    var minor: Double
    
    /**
      * Patch version
      */
    var patch: Double
    
    /**
      * Pre-release version
      */
    var pre: String
  }
  object ParsedNodeVersion {
    
    inline def apply(build: String, major: Double, minor: Double, patch: Double, pre: String): ParsedNodeVersion = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedNodeVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedNodeVersion] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPre(value: String): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    }
  }
}
