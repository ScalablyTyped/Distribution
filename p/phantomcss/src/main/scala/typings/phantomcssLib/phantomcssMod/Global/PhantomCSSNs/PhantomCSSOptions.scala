package typings
package phantomcssLib.phantomcssMod.Global.PhantomCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhantomCSSOptions extends js.Object {
  /**
    Don't add count number to images. If set to false (default), a filename is
    required when capturing screenshots.
    */
  var addIteratorToImage: scala.Boolean
  /**
    * Don't add label to generated failure image
    */
  var addLabelToFailedImage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    A reference to a particular Casper instance. Required for SlimerJS.
    */
  var casper: js.UndefOr[casperjsLib.casperjsMod.Casper] = js.undefined
  /**
    Remove results directory tree after run.  Use in conjunction
    with failedComparisonsRoot to see failed comparisons.
    */
  var cleanupComparisonImages: js.UndefOr[scala.Boolean] = js.undefined
  /**
    You might want to keep master/baseline images in a completely
    different folder to the diffs/failures.  Useful when working
    with version control systems. By default this resolves to the
    screenshotRoot folder.
    */
  var comparisonResultRoot: js.UndefOr[java.lang.String] = js.undefined
  /**
    By default, failure images are put in the './failures' folder.
    If failedComparisonsRoot is set to false a separate folder will
    not be created but failure images can still be found alongside
    the original and new images.
    */
  var failedComparisonsRoot: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the output screenshot filenames for your specific
    * integration
    */
  var fileNameGetter: js.UndefOr[
    js.Function2[
      /* rootPath */ java.lang.String, 
      /* fileName */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var hideElements: js.UndefOr[java.lang.String] = js.undefined
  /**
    libraryRoot is relative to this file and must point to your phantomcss folder (not lib or node_modules). If you are using NPM, this will be './node_modules/phantomcss'.
    */
  var libraryRoot: js.UndefOr[java.lang.String] = js.undefined
  /**
    Mismatch tolerance defaults to  0.05%. Increasing this value
    will decrease test coverage
    */
  var mismatchTolerance: js.UndefOr[scala.Double] = js.undefined
  var onComplete: js.UndefOr[
    js.Function3[
      /* tests */ js.Array[PhantomCSSTest], 
      /* noOfFails */ scala.Double, 
      /* noOfErrors */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onFail: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, scala.Unit]] = js.undefined
  /**
    Called when creating new baseline images
    */
  var onNewImage: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, scala.Unit]] = js.undefined
  var onPass: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, scala.Unit]] = js.undefined
  var onTimeout: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, scala.Unit]] = js.undefined
  var outputSettings: js.UndefOr[resemblejsLib.resemblejsMod.ResembleNs.OutputSettings] = js.undefined
  /**
    Prefix the screenshot number to the filename, instead of suffixing it
    */
  var prefixCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    Rebase is useful when you want to create new baseline
    images without manually deleting the files
    casperjs demo/test.js --rebase
    */
  var rebase: js.UndefOr[js.Any] = js.undefined
  var screenshotRoot: js.UndefOr[java.lang.String] = js.undefined
}

object PhantomCSSOptions {
  @scala.inline
  def apply(
    addIteratorToImage: scala.Boolean,
    addLabelToFailedImage: js.UndefOr[scala.Boolean] = js.undefined,
    casper: casperjsLib.casperjsMod.Casper = null,
    cleanupComparisonImages: js.UndefOr[scala.Boolean] = js.undefined,
    comparisonResultRoot: java.lang.String = null,
    failedComparisonsRoot: java.lang.String = null,
    fileNameGetter: js.Function2[
      /* rootPath */ java.lang.String, 
      /* fileName */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null,
    hideElements: java.lang.String = null,
    libraryRoot: java.lang.String = null,
    mismatchTolerance: scala.Int | scala.Double = null,
    onComplete: js.Function3[
      /* tests */ js.Array[PhantomCSSTest], 
      /* noOfFails */ scala.Double, 
      /* noOfErrors */ scala.Double, 
      scala.Unit
    ] = null,
    onFail: js.Function1[/* test */ PhantomCSSTest, scala.Unit] = null,
    onNewImage: js.Function1[/* test */ PhantomCSSTest, scala.Unit] = null,
    onPass: js.Function1[/* test */ PhantomCSSTest, scala.Unit] = null,
    onTimeout: js.Function1[/* test */ PhantomCSSTest, scala.Unit] = null,
    outputSettings: resemblejsLib.resemblejsMod.ResembleNs.OutputSettings = null,
    prefixCount: js.UndefOr[scala.Boolean] = js.undefined,
    rebase: js.Any = null,
    screenshotRoot: java.lang.String = null
  ): PhantomCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addIteratorToImage")(addIteratorToImage)
    if (!js.isUndefined(addLabelToFailedImage)) __obj.updateDynamic("addLabelToFailedImage")(addLabelToFailedImage)
    if (casper != null) __obj.updateDynamic("casper")(casper)
    if (!js.isUndefined(cleanupComparisonImages)) __obj.updateDynamic("cleanupComparisonImages")(cleanupComparisonImages)
    if (comparisonResultRoot != null) __obj.updateDynamic("comparisonResultRoot")(comparisonResultRoot)
    if (failedComparisonsRoot != null) __obj.updateDynamic("failedComparisonsRoot")(failedComparisonsRoot)
    if (fileNameGetter != null) __obj.updateDynamic("fileNameGetter")(fileNameGetter)
    if (hideElements != null) __obj.updateDynamic("hideElements")(hideElements)
    if (libraryRoot != null) __obj.updateDynamic("libraryRoot")(libraryRoot)
    if (mismatchTolerance != null) __obj.updateDynamic("mismatchTolerance")(mismatchTolerance.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onFail != null) __obj.updateDynamic("onFail")(onFail)
    if (onNewImage != null) __obj.updateDynamic("onNewImage")(onNewImage)
    if (onPass != null) __obj.updateDynamic("onPass")(onPass)
    if (onTimeout != null) __obj.updateDynamic("onTimeout")(onTimeout)
    if (outputSettings != null) __obj.updateDynamic("outputSettings")(outputSettings)
    if (!js.isUndefined(prefixCount)) __obj.updateDynamic("prefixCount")(prefixCount)
    if (rebase != null) __obj.updateDynamic("rebase")(rebase)
    if (screenshotRoot != null) __obj.updateDynamic("screenshotRoot")(screenshotRoot)
    __obj.asInstanceOf[PhantomCSSOptions]
  }
}

