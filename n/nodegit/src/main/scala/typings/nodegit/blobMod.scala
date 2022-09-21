package typings.nodegit

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.WriteStream
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.wrapperMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobMod {
  
  @JSImport("nodegit/blob", "Blob")
  @js.native
  open class Blob () extends StObject {
    
    def content(): Buffer = js.native
    
    def dup(): js.Promise[Blob] = js.native
    
    def filemode(): Double = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def isBinary(): Double = js.native
    
    def owner(): Repository = js.native
    
    def rawcontent(): Wrapper = js.native
    
    def rawsize(): Double = js.native
  }
  /* static members */
  object Blob {
    
    @JSImport("nodegit/blob", "Blob")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param repo - repository where to blob will be written
      * @param buffer - data to be written into the blob
      * @param len - length of the data
      * @returns - return the id of the written blob
      */
    inline def createFromBuffer(repo: Repository, buffer: Buffer, len: Double): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(repo.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    /**
      * @param repo - repository where the blob will be written. this repository can be bare or not
      * @param path - file from which the blob will be created
      */
    inline def createFromDisk(repo: Repository, path: String): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromDisk")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def createFromStream(repo: Repository, hintPath: String): js.Promise[WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(repo.asInstanceOf[js.Any], hintPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteStream]]
    
    /**
      * @param repo - repository where the blob will be written. this repository cannot be bare
      * @param relativePath - file from which the blob will be created, relative to the repository's working dir
      * @returns - 0 or an error code
      */
    inline def createFromWorkdir(repo: Repository, relativePath: String): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromWorkdir")(repo.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def filteredContent(blob: Blob, as_path: String, check_for_binary_data: Double): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("filteredContent")(blob.asInstanceOf[js.Any], as_path.asInstanceOf[js.Any], check_for_binary_data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    inline def lookup(repo: Repository, id: String): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
    inline def lookup(repo: Repository, id: Blob): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
    inline def lookup(repo: Repository, id: Oid): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
    
    inline def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  }
}
