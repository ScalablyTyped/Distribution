package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequest extends EventTarget {
  val id: java.lang.String = js.native
  var onshippingaddresschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onshippingoptionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val shippingAddress: PaymentAddress | scala.Null = js.native
  val shippingOption: java.lang.String | scala.Null = js.native
  val shippingType: PaymentShippingType | scala.Null = js.native
  def abort(): js.Promise[scala.Unit] = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def show(): js.Promise[PaymentResponse] = js.native
}

@JSGlobal("PaymentRequest")
@js.native
object PaymentRequest
  extends org.scalablytyped.runtime.Instantiable2[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetailsInit, 
      PaymentRequest
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetailsInit, 
      /* options */ PaymentOptions, 
      PaymentRequest
    ]

