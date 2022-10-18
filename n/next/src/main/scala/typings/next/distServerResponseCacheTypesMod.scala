package typings.next

import typings.next.anon.CurRevalidate
import typings.next.anon.IsPrefetch
import typings.next.distServerRenderResultMod.default
import typings.next.nextBooleans.`false`
import typings.next.nextStrings.IMAGE
import typings.next.nextStrings.PAGE
import typings.next.nextStrings.REDIRECT
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerResponseCacheTypesMod {
  
  trait CachedImageValue
    extends StObject
       with IncrementalCacheValue
       with ResponseCacheValue {
    
    var buffer: Buffer
    
    var etag: String
    
    var `extension`: String
    
    var isMiss: js.UndefOr[Boolean] = js.undefined
    
    var isStale: js.UndefOr[Boolean] = js.undefined
    
    var kind: IMAGE
  }
  object CachedImageValue {
    
    inline def apply(buffer: Buffer, etag: String, `extension`: String): CachedImageValue = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], kind = "IMAGE")
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedImageValue]
    }
    
    extension [Self <: CachedImageValue](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setIsMiss(value: Boolean): Self = StObject.set(x, "isMiss", value.asInstanceOf[js.Any])
      
      inline def setIsMissUndefined: Self = StObject.set(x, "isMiss", js.undefined)
      
      inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      inline def setIsStaleUndefined: Self = StObject.set(x, "isStale", js.undefined)
      
      inline def setKind(value: IMAGE): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait CachedPageValue
    extends StObject
       with ResponseCacheValue {
    
    var html: default
    
    var kind: PAGE
    
    var pageData: js.Object
  }
  object CachedPageValue {
    
    inline def apply(html: default, pageData: js.Object): CachedPageValue = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], kind = "PAGE", pageData = pageData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedPageValue]
    }
    
    extension [Self <: CachedPageValue](x: Self) {
      
      inline def setHtml(value: default): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setKind(value: PAGE): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPageData(value: js.Object): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
    }
  }
  
  trait CachedRedirectValue
    extends StObject
       with IncrementalCacheValue
       with ResponseCacheValue {
    
    var kind: REDIRECT
    
    var props: js.Object
  }
  object CachedRedirectValue {
    
    inline def apply(props: js.Object): CachedRedirectValue = {
      val __obj = js.Dynamic.literal(kind = "REDIRECT", props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedRedirectValue]
    }
    
    extension [Self <: CachedRedirectValue](x: Self) {
      
      inline def setKind(value: REDIRECT): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IncrementalCache extends StObject {
    
    def get(key: String): js.Promise[IncrementalCacheItem] = js.native
    
    def set(key: String): js.Promise[Unit] = js.native
    def set(key: String, data: Null, revalidate: Double): js.Promise[Unit] = js.native
    def set(key: String, data: IncrementalCacheValue): js.Promise[Unit] = js.native
    def set(key: String, data: IncrementalCacheValue, revalidate: Double): js.Promise[Unit] = js.native
    @JSName("set")
    def set_false(key: String, data: Null, revalidate: `false`): js.Promise[Unit] = js.native
    @JSName("set")
    def set_false(key: String, data: IncrementalCacheValue, revalidate: `false`): js.Promise[Unit] = js.native
  }
  
  trait IncrementalCacheEntry extends StObject {
    
    var curRevalidate: js.UndefOr[Double | `false`] = js.undefined
    
    var isStale: js.UndefOr[Boolean] = js.undefined
    
    var revalidateAfter: Double | `false`
    
    var value: IncrementalCacheValue | Null
  }
  object IncrementalCacheEntry {
    
    inline def apply(revalidateAfter: Double | `false`): IncrementalCacheEntry = {
      val __obj = js.Dynamic.literal(revalidateAfter = revalidateAfter.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[IncrementalCacheEntry]
    }
    
    extension [Self <: IncrementalCacheEntry](x: Self) {
      
      inline def setCurRevalidate(value: Double | `false`): Self = StObject.set(x, "curRevalidate", value.asInstanceOf[js.Any])
      
      inline def setCurRevalidateUndefined: Self = StObject.set(x, "curRevalidate", js.undefined)
      
      inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      inline def setIsStaleUndefined: Self = StObject.set(x, "isStale", js.undefined)
      
      inline def setRevalidateAfter(value: Double | `false`): Self = StObject.set(x, "revalidateAfter", value.asInstanceOf[js.Any])
      
      inline def setValue(value: IncrementalCacheValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  type IncrementalCacheItem = CurRevalidate | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.distServerResponseCacheTypesMod.CachedRedirectValue
    - typings.next.distServerResponseCacheTypesMod.IncrementalCachedPageValue
    - typings.next.distServerResponseCacheTypesMod.CachedImageValue
  */
  trait IncrementalCacheValue extends StObject
  object IncrementalCacheValue {
    
    inline def CachedImageValue(buffer: Buffer, etag: String, `extension`: String): typings.next.distServerResponseCacheTypesMod.CachedImageValue = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], kind = "IMAGE")
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distServerResponseCacheTypesMod.CachedImageValue]
    }
    
    inline def CachedRedirectValue(props: js.Object): typings.next.distServerResponseCacheTypesMod.CachedRedirectValue = {
      val __obj = js.Dynamic.literal(kind = "REDIRECT", props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distServerResponseCacheTypesMod.CachedRedirectValue]
    }
    
    inline def IncrementalCachedPageValue(html: String, pageData: js.Object): typings.next.distServerResponseCacheTypesMod.IncrementalCachedPageValue = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], kind = "PAGE", pageData = pageData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distServerResponseCacheTypesMod.IncrementalCachedPageValue]
    }
  }
  
  trait IncrementalCachedPageValue
    extends StObject
       with IncrementalCacheValue {
    
    var html: String
    
    var kind: PAGE
    
    var pageData: js.Object
  }
  object IncrementalCachedPageValue {
    
    inline def apply(html: String, pageData: js.Object): IncrementalCachedPageValue = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], kind = "PAGE", pageData = pageData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncrementalCachedPageValue]
    }
    
    extension [Self <: IncrementalCachedPageValue](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setKind(value: PAGE): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPageData(value: js.Object): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseCacheBase extends StObject {
    
    def get(key: String, responseGenerator: ResponseGenerator, context: IsPrefetch): js.Promise[ResponseCacheEntry | Null] = js.native
    def get(key: Null, responseGenerator: ResponseGenerator, context: IsPrefetch): js.Promise[ResponseCacheEntry | Null] = js.native
  }
  
  trait ResponseCacheEntry extends StObject {
    
    var isMiss: js.UndefOr[Boolean] = js.undefined
    
    var isStale: js.UndefOr[Boolean] = js.undefined
    
    var revalidate: js.UndefOr[Double | `false`] = js.undefined
    
    var value: ResponseCacheValue | Null
  }
  object ResponseCacheEntry {
    
    inline def apply(): ResponseCacheEntry = {
      val __obj = js.Dynamic.literal(value = null)
      __obj.asInstanceOf[ResponseCacheEntry]
    }
    
    extension [Self <: ResponseCacheEntry](x: Self) {
      
      inline def setIsMiss(value: Boolean): Self = StObject.set(x, "isMiss", value.asInstanceOf[js.Any])
      
      inline def setIsMissUndefined: Self = StObject.set(x, "isMiss", js.undefined)
      
      inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      inline def setIsStaleUndefined: Self = StObject.set(x, "isStale", js.undefined)
      
      inline def setRevalidate(value: Double | `false`): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      inline def setValue(value: ResponseCacheValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.distServerResponseCacheTypesMod.CachedRedirectValue
    - typings.next.distServerResponseCacheTypesMod.CachedPageValue
    - typings.next.distServerResponseCacheTypesMod.CachedImageValue
  */
  trait ResponseCacheValue extends StObject
  object ResponseCacheValue {
    
    inline def CachedImageValue(buffer: Buffer, etag: String, `extension`: String): typings.next.distServerResponseCacheTypesMod.CachedImageValue = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], kind = "IMAGE")
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distServerResponseCacheTypesMod.CachedImageValue]
    }
    
    inline def CachedPageValue(html: default, pageData: js.Object): typings.next.distServerResponseCacheTypesMod.CachedPageValue = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], kind = "PAGE", pageData = pageData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distServerResponseCacheTypesMod.CachedPageValue]
    }
    
    inline def CachedRedirectValue(props: js.Object): typings.next.distServerResponseCacheTypesMod.CachedRedirectValue = {
      val __obj = js.Dynamic.literal(kind = "REDIRECT", props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distServerResponseCacheTypesMod.CachedRedirectValue]
    }
  }
  
  type ResponseGenerator = js.Function2[
    /* hasResolved */ Boolean, 
    /* hadCache */ Boolean, 
    js.Promise[ResponseCacheEntry | Null]
  ]
}
