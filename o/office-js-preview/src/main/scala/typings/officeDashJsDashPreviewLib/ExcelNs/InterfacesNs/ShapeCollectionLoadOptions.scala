package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents all the shapes in the worksheet.
         *
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait ShapeCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns or sets the alternative descriptive text string for a Shape object when the object is saved to a Web page.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var altTextDescription: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns or sets the alternative title text string for a Shape object when the object is saved to a Web page.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var altTextTitle: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns the fill formatting of the shape object.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var fill: js.UndefOr[ShapeFillLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns the geometric shape for the shape object. Error will be thrown, if the shape object is other shape type (Like, Image, SmartArt, etc.) rather than GeometricShape.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var geometricShape: js.UndefOr[GeometricShapeLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the geometric shape type of the specified shape. See Excel.GeometricShapeType for detail. Returns null if the shape is not geometric, for example, get GeometricShapeType of a line or a chart will return null.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var geometricShapeType: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns the shape group for the shape object. Error will be thrown, if the shape object is other shape type (Like, Image, SmartArt, etc.) rather than GroupShape.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var group: js.UndefOr[ShapeGroupLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the height, in points, of the shape.
              Throws an invalid argument exception when set with negative value or zero as input.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var height: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the shape identifier. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns the image for the shape object. Error will be thrown, if the shape object is other shape type (Like, GeometricShape, SmartArt, etc.) rather than Image.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The distance, in points, from the left side of the shape to the left of the worksheet.
              Throws an invalid argument exception when set with negative value as input.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var left: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents if the aspect ratio locked, in boolean, of the shape.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the name of the shape. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the placment, value that represents the way the object is attached to the cells below it.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var placement: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the rotation, in degrees, of the shape.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var rotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns the textFrame object of a shape. Read only.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var textFrame: js.UndefOr[TextFrameLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The distance, in points, from the top edge of the shape to the top of the worksheet.
              Throws an invalid argument exception when set with negative value as input.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var top: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns the type of the specified shape. Read-only. See Excel.ShapeType for detail.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the visibility, in boolean, of the specified shape.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the width, in points, of the shape.
              Throws an invalid argument exception when set with negative value or zero as input.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var width: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns the position of the specified shape in the z-order, the very bottom shape's z-order value is 0. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var zorderPosition: js.UndefOr[scala.Boolean] = js.undefined
}

