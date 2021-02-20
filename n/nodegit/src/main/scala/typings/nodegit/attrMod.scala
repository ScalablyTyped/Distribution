package typings.nodegit

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attrMod {
  
  @JSImport("nodegit/attr", "Attr")
  @js.native
  class Attr () extends StObject
  /* static members */
  object Attr {
    
    @JSImport("nodegit/attr", "Attr.addMacro")
    @js.native
    def addMacro(repo: Repository, name: String, values: String): Double = js.native
    
    @JSImport("nodegit/attr", "Attr.cacheFlush")
    @js.native
    def cacheFlush(repo: Repository): Unit = js.native
    
    /**
      * @param repo - The repository containing the path.
      * @param flags - A combination of GIT_ATTR_CHECK... flags.
      * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
      * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
      * @param name - The name of the attribute to look up.
      * @returns - Output of the value of the attribute. Use the GIT_ATTR_...
      */
    @JSImport("nodegit/attr", "Attr.get")
    @js.native
    def get(repo: Repository, flags: Double, path: String, name: String): js.Promise[String] = js.native
    
    /**
      * @param repo - The repository containing the path.
      * @param flags - A combination of GIT_ATTR_CHECK... flags.
      * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
      * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
      * @param numAttr - The number of attributes being looked up
      * @param names - An array of num_attr strings containing attribute names.
      */
    @JSImport("nodegit/attr", "Attr.getMany")
    @js.native
    def getMany(repo: Repository, flags: Double, path: String, numAttr: Double, names: String): js.Array[_] = js.native
    
    /**
      * @param attr - The attribute
      * @returns - the value type for the attribute
      */
    @JSImport("nodegit/attr", "Attr.value")
    @js.native
    def value(attr: String): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait STATES extends StObject
    object STATES {
      
      @scala.inline
      def FALSE_T: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def TRUE_T: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def UNSPECIFIED_T: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def VALUE_T: `3` = 3.asInstanceOf[`3`]
    }
  }
}
