package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitNumbers.`-1`
import typings.nodegit.nodegitNumbers.`-2`
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`5`
import typings.nodegit.nodegitNumbers.`6`
import typings.nodegit.nodegitNumbers.`7`
import typings.nodegit.objectMod.Object.TYPE
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("nodegit/object", "Object")
  @js.native
  class Object () extends StObject {
    
    def dup(): js.Promise[Object] = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def lookupByPath(path: String, `type`: TYPE): js.Promise[Object] = js.native
    
    def owner(): Repository = js.native
    
    def peel(targetType: Double): js.Promise[Object] = js.native
    
    def shortId(): js.Promise[Buf] = js.native
    
    def `type`(): Double = js.native
  }
  /* static members */
  object Object {
    
    @JSImport("nodegit/object", "Object")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def lookup(repo: Repository, id: Oid, `type`: TYPE): js.Promise[Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Object]]
    
    @scala.inline
    def lookupPrefix(repo: Repository, id: Oid, len: Double, `type`: TYPE): js.Promise[Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Object]]
    
    @scala.inline
    def size(`type`: TYPE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def string2Type(str: String): TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("string2Type")(str.asInstanceOf[js.Any]).asInstanceOf[TYPE]
    
    @scala.inline
    def type2String(`type`: TYPE): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type2String")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def typeisloose(`type`: TYPE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("typeisloose")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`-2`
      - typings.nodegit.nodegitNumbers.`-1`
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
      - typings.nodegit.nodegitNumbers.`6`
      - typings.nodegit.nodegitNumbers.`7`
    */
    trait TYPE extends StObject
    object TYPE {
      
      @scala.inline
      def ANY: `-2` = -2.asInstanceOf[`-2`]
      
      @scala.inline
      def BAD: `-1` = -1.asInstanceOf[`-1`]
      
      @scala.inline
      def BLOB: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def COMMIT: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def EXT1: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def EXT2: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def OFS_DELTA: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def REF_DELTA: `7` = 7.asInstanceOf[`7`]
      
      @scala.inline
      def TAG: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def TREE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
