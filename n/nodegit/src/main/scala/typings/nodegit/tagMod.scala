package typings.nodegit

import typings.nodegit.objectMod.Object
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("nodegit/tag", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def annotationCreate(repo: Repository, tagName: String, target: Object, tagger: Signature, message: String): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotationCreate")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    @scala.inline
    def create(
      repo: Repository,
      tagName: String,
      target: Object,
      tagger: Signature,
      message: String,
      force: Double
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    @scala.inline
    def createLightweight(repo: Repository, tagName: String, target: Object, force: Double): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightweight")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    @scala.inline
    def delete(repo: Repository, tagName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    @scala.inline
    def list(repo: Repository): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
    
    @scala.inline
    def listMatch(tagNames: String, pattern: String, repo: Repository): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(tagNames.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def listMatch(tagNames: js.Array[String], pattern: String, repo: Repository): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(tagNames.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def listMatch(tagNames: Strarray, pattern: String, repo: Repository): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(tagNames.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Retrieves the tag pointed to by the oid
      *
      *
      */
    @scala.inline
    def lookup(repo: Repository, id: String): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
    @scala.inline
    def lookup(repo: Repository, id: Oid): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
    @scala.inline
    def lookup(repo: Repository, id: Tag): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
    
    @scala.inline
    def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
  }
}
