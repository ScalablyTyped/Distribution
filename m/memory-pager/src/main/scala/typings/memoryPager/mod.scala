package typings.memoryPager

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.memoryPager.memoryPagerBooleans.`false`
import typings.memoryPager.memoryPagerBooleans.`true`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("memory-pager", JSImport.Namespace)
  @js.native
  val ^ : Pager = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("memory-pager", JSImport.Namespace)
  @js.native
  /**
    * Create a new pager.
    * @param pageSize defaults to 1024.
    */
  class Class () extends PagerInstance {
    def this(pageSize: Double) = this()
  }
  
  @js.native
  trait Page extends StObject {
    
    var buffer: Buffer = js.native
    
    var offset: Double = js.native
  }
  object Page {
    
    @scala.inline
    def apply(buffer: Buffer, offset: Double): Page = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pager
    extends /**
    * Create a new pager.
    * @param pageSize defaults to 1024.
    */
  Instantiable0[PagerInstance]
       with Instantiable1[/* pageSize */ Double, PagerInstance] {
    
    /**
      * Create a new pager.
      * @param pageSize defaults to 1024.
      */
    def apply(): PagerInstance = js.native
    def apply(pageSize: Double): PagerInstance = js.native
  }
  
  @js.native
  trait PagerInstance extends StObject {
    
    /**
      * Get a page. The page will be allocated at first access.
      * @param pageNumber
      * @param noAllocate will make the method return `undefined` if no page has been allocated already
      */
    def get(pageNumber: Double): Page = js.native
    @JSName("get")
    def get_false(pageNumber: Double, noAllocate: `false`): Page = js.native
    @JSName("get")
    def get_true(pageNumber: Double, noAllocate: `true`): js.UndefOr[Page] = js.native
    
    /**
      * Get the last page that was updated.
      */
    def lastUpdate(): Page | Null = js.native
    
    /**
      * Explicitly set the buffer for a page.
      */
    def set(pageNumber: Double, buffer: Buffer): Unit = js.native
    
    /**
      * Concat all pages allocated pages into a single buffer.
      */
    def toBuffer(): Buffer = js.native
    
    /**
      * Mark a page as updated.
      */
    def updated(page: Page): Unit = js.native
  }
  
  type _To = Pager
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Pager = ^
}
