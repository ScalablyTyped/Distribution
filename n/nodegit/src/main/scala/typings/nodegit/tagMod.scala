package typings.nodegit

import typings.nodegit.anon.Code
import typings.nodegit.objectMod.Object
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("nodegit/tag", "Tag")
  @js.native
  open class Tag () extends StObject {
    
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
    
    inline def annotationCreate(repo: Repository, tagName: String, target: Object, tagger: Signature, message: String): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotationCreate")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def create(
      repo: Repository,
      tagName: String,
      target: Object,
      tagger: Signature,
      message: String,
      force: Double
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def createLightweight(repo: Repository, tagName: String, target: Object, force: Double): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightweight")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def createWithSignature(
      repo: Repository,
      tagName: String,
      target: String,
      tagger: Signature,
      message: String,
      force: Double,
      signingCallback: js.Function1[/* data */ String, js.Promise[Code] | Code]
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any], signingCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    inline def createWithSignature(
      repo: Repository,
      tagName: String,
      target: String,
      tagger: Signature,
      message: Null,
      force: Double,
      signingCallback: js.Function1[/* data */ String, js.Promise[Code] | Code]
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any], signingCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    inline def createWithSignature(
      repo: Repository,
      tagName: String,
      target: String,
      tagger: Signature,
      message: Unit,
      force: Double,
      signingCallback: js.Function1[/* data */ String, js.Promise[Code] | Code]
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any], signingCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    inline def createWithSignature(
      repo: Repository,
      tagName: String,
      target: Oid,
      tagger: Signature,
      message: String,
      force: Double,
      signingCallback: js.Function1[/* data */ String, js.Promise[Code] | Code]
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any], signingCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    inline def createWithSignature(
      repo: Repository,
      tagName: String,
      target: Oid,
      tagger: Signature,
      message: Null,
      force: Double,
      signingCallback: js.Function1[/* data */ String, js.Promise[Code] | Code]
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any], signingCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    inline def createWithSignature(
      repo: Repository,
      tagName: String,
      target: Oid,
      tagger: Signature,
      message: Unit,
      force: Double,
      signingCallback: js.Function1[/* data */ String, js.Promise[Code] | Code]
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any], signingCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def delete(repo: Repository, tagName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def list(repo: Repository): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
    
    inline def listMatch(pattern: String, repo: Repository): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    
    /**
      * Retrieves the tag pointed to by the oid
      *
      *
      */
    inline def lookup(repo: Repository, id: String): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
    inline def lookup(repo: Repository, id: Oid): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
    inline def lookup(repo: Repository, id: Tag): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
    
    inline def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tag]]
  }
}
