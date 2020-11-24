package typings.nodeZopfli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If true, splits the data in multiple deflate blocks with optimal choice for the block boundaries.
    * Block splitting gives better compression.
    */
  var blocksplitting: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, chooses the optimal block split points only after doing the iterative LZ77 compression.
    * If false, chooses the block split points first, then does iterative LZ77 on each individual block.
    * Depending on the file, either first or last gives the best compression.
    */
  var blocksplittinglast: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum amount of blocks to split into (0 for unlimited,
    * but this can give extreme results that hurt compression on some files).
    */
  var blocksplittingmax: js.UndefOr[Double] = js.native
  
  /**
    * Maximum amount of times to rerun forward and backward pass to optimize LZ77 compression cost.
    * Good values: 10, 15 for small files, 5 for files over several MB in size or it will be too slow.
    */
  var numiterations: js.UndefOr[Double] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  var verbose_more: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlocksplitting(value: Boolean): Self = this.set("blocksplitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocksplitting: Self = this.set("blocksplitting", js.undefined)
    
    @scala.inline
    def setBlocksplittinglast(value: Boolean): Self = this.set("blocksplittinglast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocksplittinglast: Self = this.set("blocksplittinglast", js.undefined)
    
    @scala.inline
    def setBlocksplittingmax(value: Double): Self = this.set("blocksplittingmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocksplittingmax: Self = this.set("blocksplittingmax", js.undefined)
    
    @scala.inline
    def setNumiterations(value: Double): Self = this.set("numiterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumiterations: Self = this.set("numiterations", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setVerbose_more(value: Boolean): Self = this.set("verbose_more", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose_more: Self = this.set("verbose_more", js.undefined)
  }
}
