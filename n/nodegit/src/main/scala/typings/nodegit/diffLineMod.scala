package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffLineMod {
  
  @JSImport("nodegit/diff-line", "DiffLine")
  @js.native
  class DiffLine () extends StObject {
    
    /**
      * The relevant line
      *
      *
      */
    def content(): String = js.native
    
    def contentLen(): Double = js.native
    
    def contentOffset(): Double = js.native
    
    def newLineno(): Double = js.native
    
    def numLines(): Double = js.native
    
    def oldLineno(): Double = js.native
    
    def origin(): Double = js.native
    
    /**
      * The non utf8 translated text
      *
      *
      */
    def rawContent(): String = js.native
  }
}
