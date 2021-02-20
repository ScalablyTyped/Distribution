package typings.nodegit

import typings.nodegit.objectMod.Object
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("nodegit/tag", "Tag")
  @js.native
  class Tag () extends StObject {
    
    def dup(): js.Promise[Tag] = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def message(): String = js.native
    
    def name(): String = js.native
    
    def owner(): Repository = js.native
    
    def peel(tagTargetOut: Object): Double = js.native
    
    def tagger(): Signature = js.native
    
    def target(): js.Promise[Object] = js.native
    
    def targetId(): Oid = js.native
    
    def targetType(): Double = js.native
  }
  /* static members */
  object Tag {
    
    @JSImport("nodegit/tag", "Tag.annotationCreate")
    @js.native
    def annotationCreate(repo: Repository, tagName: String, target: Object, tagger: Signature, message: String): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/tag", "Tag.create")
    @js.native
    def create(
      repo: Repository,
      tagName: String,
      target: Object,
      tagger: Signature,
      message: String,
      force: Double
    ): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/tag", "Tag.createLightweight")
    @js.native
    def createLightweight(repo: Repository, tagName: String, target: Object, force: Double): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/tag", "Tag.delete")
    @js.native
    def delete(repo: Repository, tagName: String): js.Promise[Double] = js.native
    
    @JSImport("nodegit/tag", "Tag.list")
    @js.native
    def list(repo: Repository): js.Promise[js.Array[_]] = js.native
    
    @JSImport("nodegit/tag", "Tag.listMatch")
    @js.native
    def listMatch(tagNames: String, pattern: String, repo: Repository): Double = js.native
    @JSImport("nodegit/tag", "Tag.listMatch")
    @js.native
    def listMatch(tagNames: js.Array[String], pattern: String, repo: Repository): Double = js.native
    @JSImport("nodegit/tag", "Tag.listMatch")
    @js.native
    def listMatch(tagNames: Strarray, pattern: String, repo: Repository): Double = js.native
    
    /**
      * Retrieves the tag pointed to by the oid
      *
      *
      */
    @JSImport("nodegit/tag", "Tag.lookup")
    @js.native
    def lookup(repo: Repository, id: String): js.Promise[Tag] = js.native
    @JSImport("nodegit/tag", "Tag.lookup")
    @js.native
    def lookup(repo: Repository, id: Oid): js.Promise[Tag] = js.native
    @JSImport("nodegit/tag", "Tag.lookup")
    @js.native
    def lookup(repo: Repository, id: Tag): js.Promise[Tag] = js.native
    
    @JSImport("nodegit/tag", "Tag.lookupPrefix")
    @js.native
    def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Tag] = js.native
  }
}
