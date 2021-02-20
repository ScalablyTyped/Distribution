package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteSheet extends StObject {
  
  /** The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit. */
  var columnCount: js.UndefOr[Double] = js.native
  
  /** End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file. */
  var endTimeOffset: js.UndefOr[String] = js.native
  
  /**
    * Required. File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as
    * `"sprite_sheet0000000123.jpeg"`.
    */
  var filePrefix: js.UndefOr[String] = js.native
  
  /** Format type. The default is `"jpeg"`. Supported formats: - 'jpeg' */
  var format: js.UndefOr[String] = js.native
  
  /** Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds. */
  var interval: js.UndefOr[String] = js.native
  
  /** The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit. */
  var rowCount: js.UndefOr[Double] = js.native
  
  /** Required. The height of sprite in pixels. Must be an even integer. */
  var spriteHeightPixels: js.UndefOr[Double] = js.native
  
  /** Required. The width of sprite in pixels. Must be an even integer. */
  var spriteWidthPixels: js.UndefOr[Double] = js.native
  
  /** Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`. */
  var startTimeOffset: js.UndefOr[String] = js.native
  
  /** Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100. */
  var totalCount: js.UndefOr[Double] = js.native
}
object SpriteSheet {
  
  @scala.inline
  def apply(): SpriteSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteSheet]
  }
  
  @scala.inline
  implicit class SpriteSheetMutableBuilder[Self <: SpriteSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    @scala.inline
    def setFilePrefix(value: String): Self = StObject.set(x, "filePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePrefixUndefined: Self = StObject.set(x, "filePrefix", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setSpriteHeightPixels(value: Double): Self = StObject.set(x, "spriteHeightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteHeightPixelsUndefined: Self = StObject.set(x, "spriteHeightPixels", js.undefined)
    
    @scala.inline
    def setSpriteWidthPixels(value: Double): Self = StObject.set(x, "spriteWidthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteWidthPixelsUndefined: Self = StObject.set(x, "spriteWidthPixels", js.undefined)
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
