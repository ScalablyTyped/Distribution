package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the paragraph formatting properties of a text that is attached to the {@link PowerPoint.TextRange}.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
trait ParagraphFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the bullet format of the paragraph. See {@link PowerPoint.BulletFormat} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var bulletFormat: js.UndefOr[BulletFormatLoadOptions] = js.undefined
  
  /**
    * Represents the horizontal alignment of the paragraph. Returns 'null' if the 'TextRange' includes text fragments with different horizontal alignment values. See {@link PowerPoint.ParagraphHorizontalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
}
object ParagraphFormatLoadOptions {
  
  inline def apply(): ParagraphFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphFormatLoadOptions]
  }
  
  extension [Self <: ParagraphFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBulletFormat(value: BulletFormatLoadOptions): Self = StObject.set(x, "bulletFormat", value.asInstanceOf[js.Any])
    
    inline def setBulletFormatUndefined: Self = StObject.set(x, "bulletFormat", js.undefined)
    
    inline def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
