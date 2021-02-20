package typings.pixiJs.PIXI

import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to **{@link https://github.com/englercj/resource-loader
  * resource-loader}**'s Resource class.
  * @see http://englercj.github.io/resource-loader/Resource.html
  * @class LoaderResource
  * @memberof PIXI
  */
@js.native
trait LoaderResource extends StObject {
  
  def abort(): Unit = js.native
  def abort(message: String): Unit = js.native
  
  var children: js.Array[LoaderResource] = js.native
  
  def complete(): Unit = js.native
  
  var crossOrigin: Boolean | String = js.native
  
  var data: js.Any = js.native
  
  var error: Error = js.native
  
  var extension: String = js.native
  
  var isComplete: Boolean = js.native
  
  var isDataUrl: Boolean = js.native
  
  var isLoading: Boolean = js.native
  
  //tslint:disable-next-line:ban-types forbidden-types
  def load(): Unit = js.native
  def load(cb: js.Function): Unit = js.native
  
  var loadType: Double = js.native
  
  var metadata: js.Any = js.native
  
  var name: String = js.native
  
  var progressChunk: Double = js.native
  
  var spineAtlas: js.Any = js.native
  
  var spineData: js.Any = js.native
  
  var spritesheet: js.UndefOr[Spritesheet] = js.native
  
  var texture: Texture = js.native
  
  var textures: js.UndefOr[ITextureDictionary] = js.native
  
  var `type`: Double = js.native
  
  var url: String = js.native
  
  var xhr: XMLHttpRequest | Null = js.native
  
  var xhrType: String = js.native
}
object LoaderResource {
  
  @js.native
  sealed trait LOAD_TYPE extends StObject
  @JSGlobal("PIXI.LoaderResource.LOAD_TYPE")
  @js.native
  object LOAD_TYPE extends StObject {
    
    /** Uses an `Audio` object to load the resource. */
    @js.native
    sealed trait AUDIO extends LOAD_TYPE
    
    /** Uses an `Image` object to load the resource. */
    @js.native
    sealed trait IMAGE extends LOAD_TYPE
    
    /** Uses a `Video` object to load the resource. */
    @js.native
    sealed trait VIDEO extends LOAD_TYPE
    
    /** Uses XMLHttpRequest to load the resource. */
    @js.native
    sealed trait XHR extends LOAD_TYPE
  }
  
  @js.native
  sealed trait STATUS_FLAGS extends StObject
  @JSGlobal("PIXI.LoaderResource.STATUS_FLAGS")
  @js.native
  object STATUS_FLAGS extends StObject {
    
    @js.native
    sealed trait COMPLETE extends STATUS_FLAGS
    
    @js.native
    sealed trait DATA_URL extends STATUS_FLAGS
    
    @js.native
    sealed trait LOADING extends STATUS_FLAGS
    
    @js.native
    sealed trait NONE extends STATUS_FLAGS
  }
  
  @js.native
  sealed trait TYPE extends StObject
  @JSGlobal("PIXI.LoaderResource.TYPE")
  @js.native
  object TYPE extends StObject {
    
    @js.native
    sealed trait AUDIO extends TYPE
    
    @js.native
    sealed trait IMAGE extends TYPE
    
    @js.native
    sealed trait JSON extends TYPE
    
    @js.native
    sealed trait TEXT extends TYPE
    
    @js.native
    sealed trait UNKNOWN extends TYPE
    
    @js.native
    sealed trait VIDEO extends TYPE
    
    @js.native
    sealed trait XML extends TYPE
  }
  
  @js.native
  sealed trait XHR_RESPONSE_TYPE extends StObject
  @JSGlobal("PIXI.LoaderResource.XHR_RESPONSE_TYPE")
  @js.native
  object XHR_RESPONSE_TYPE extends StObject {
    
    /** Blob */
    @js.native
    sealed trait BLOB extends XHR_RESPONSE_TYPE
    
    /** ArrayBuffer */
    @js.native
    sealed trait BUFFER extends XHR_RESPONSE_TYPE
    
    /** string */
    @js.native
    sealed trait DEFAULT extends XHR_RESPONSE_TYPE
    
    /** Document */
    @js.native
    sealed trait DOCUMENT extends XHR_RESPONSE_TYPE
    
    /** Object */
    @js.native
    sealed trait JSON extends XHR_RESPONSE_TYPE
    
    /** String */
    @js.native
    sealed trait TEXT extends XHR_RESPONSE_TYPE
  }
}
