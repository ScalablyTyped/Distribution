package typings.maximMazurokGapiClientFactchecktools

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFactchecktools.anon.Accesstoken
import typings.maximMazurokGapiClientFactchecktools.anon.Alt
import typings.maximMazurokGapiClientFactchecktools.anon.Callback
import typings.maximMazurokGapiClientFactchecktools.anon.Fields
import typings.maximMazurokGapiClientFactchecktools.anon.Key
import typings.maximMazurokGapiClientFactchecktools.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object factchecktools {
      
      @js.native
      trait ClaimsResource extends StObject {
        
        /** Search through fact-checked claims. */
        def search(): Request[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
        def search(request: Accesstoken): Request[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1Claim extends StObject {
        
        /** The date that the claim was made. */
        var claimDate: js.UndefOr[String] = js.undefined
        
        /** One or more reviews of this claim (namely, a fact-checking article). */
        var claimReview: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]] = js.undefined
        
        /** A person or organization stating the claim. For instance, "John Doe". */
        var claimant: js.UndefOr[String] = js.undefined
        
        /** The claim text. For instance, "Crime has doubled in the last 2 years." */
        var text: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1Claim {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1Claim = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1Claim]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1Claim](x: Self) {
          
          inline def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
          
          inline def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
          
          inline def setClaimReview(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]): Self = StObject.set(x, "claimReview", value.asInstanceOf[js.Any])
          
          inline def setClaimReviewUndefined: Self = StObject.set(x, "claimReview", js.undefined)
          
          inline def setClaimReviewVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview*): Self = StObject.set(x, "claimReview", js.Array(value*))
          
          inline def setClaimant(value: String): Self = StObject.set(x, "claimant", value.asInstanceOf[js.Any])
          
          inline def setClaimantUndefined: Self = StObject.set(x, "claimant", js.undefined)
          
          inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor extends StObject {
        
        /** Corresponds to `ClaimReview.itemReviewed.author.image`. */
        var imageUrl: js.UndefOr[String] = js.undefined
        
        /** Corresponds to `ClaimReview.itemReviewed.author.jobTitle`. */
        var jobTitle: js.UndefOr[String] = js.undefined
        
        /** A person or organization stating the claim. For instance, "John Doe". Corresponds to `ClaimReview.itemReviewed.author.name`. */
        var name: js.UndefOr[String] = js.undefined
        
        /** Corresponds to `ClaimReview.itemReviewed.author.sameAs`. */
        var sameAs: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor](x: Self) {
          
          inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          inline def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
          
          inline def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
          
          inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends StObject {
        
        /** For numeric ratings, the best value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.bestRating`. */
        var bestRating: js.UndefOr[Double] = js.undefined
        
        /** Corresponds to `ClaimReview.reviewRating.image`. */
        var imageUrl: js.UndefOr[String] = js.undefined
        
        /** Corresponds to `ClaimReview.reviewRating.ratingExplanation`. */
        var ratingExplanation: js.UndefOr[String] = js.undefined
        
        /** A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to `ClaimReview.reviewRating.ratingValue`. */
        var ratingValue: js.UndefOr[Double] = js.undefined
        
        /** The truthfulness rating as a human-readible short word or phrase. Corresponds to `ClaimReview.reviewRating.alternateName`. */
        var textualRating: js.UndefOr[String] = js.undefined
        
        /** For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.worstRating`. */
        var worstRating: js.UndefOr[Double] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating](x: Self) {
          
          inline def setBestRating(value: Double): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
          
          inline def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
          
          inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          inline def setRatingExplanation(value: String): Self = StObject.set(x, "ratingExplanation", value.asInstanceOf[js.Any])
          
          inline def setRatingExplanationUndefined: Self = StObject.set(x, "ratingExplanation", js.undefined)
          
          inline def setRatingValue(value: Double): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
          
          inline def setRatingValueUndefined: Self = StObject.set(x, "ratingValue", js.undefined)
          
          inline def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
          
          inline def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
          
          inline def setWorstRating(value: Double): Self = StObject.set(x, "worstRating", value.asInstanceOf[js.Any])
          
          inline def setWorstRatingUndefined: Self = StObject.set(x, "worstRating", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview extends StObject {
        
        /** The language this review was written in. For instance, "en" or "de". */
        var languageCode: js.UndefOr[String] = js.undefined
        
        /** The publisher of this claim review. */
        var publisher: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1Publisher] = js.undefined
        
        /** The date the claim was reviewed. */
        var reviewDate: js.UndefOr[String] = js.undefined
        
        /** Textual rating. For instance, "Mostly false". */
        var textualRating: js.UndefOr[String] = js.undefined
        
        /** The title of this claim review, if it can be determined. */
        var title: js.UndefOr[String] = js.undefined
        
        /** The URL of this claim review. */
        var url: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview](x: Self) {
          
          inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
          
          inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
          
          inline def setPublisher(value: GoogleFactcheckingFactchecktoolsV1alpha1Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
          
          inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
          
          inline def setReviewDate(value: String): Self = StObject.set(x, "reviewDate", value.asInstanceOf[js.Any])
          
          inline def setReviewDateUndefined: Self = StObject.set(x, "reviewDate", js.undefined)
          
          inline def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
          
          inline def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends StObject {
        
        /** Corresponds to `ClaimReview.author.image`. */
        var imageUrl: js.UndefOr[String] = js.undefined
        
        /** Name of the organization that is publishing the fact check. Corresponds to `ClaimReview.author.name`. */
        var name: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor](x: Self) {
          
          inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup extends StObject {
        
        /**
          * A list of links to works in which this claim appears, aside from the one specified in `claim_first_appearance`. Corresponds to
          * `ClaimReview.itemReviewed[@‍type=Claim].appearance.url`.
          */
        var claimAppearances: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Info about the author of this claim. */
        var claimAuthor: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] = js.undefined
        
        /** The date when the claim was made or entered public discourse. Corresponds to `ClaimReview.itemReviewed.datePublished`. */
        var claimDate: js.UndefOr[String] = js.undefined
        
        /** A link to a work in which this claim first appears. Corresponds to `ClaimReview.itemReviewed[@‍type=Claim].firstAppearance.url`. */
        var claimFirstAppearance: js.UndefOr[String] = js.undefined
        
        /** The location where this claim was made. Corresponds to `ClaimReview.itemReviewed.name`. */
        var claimLocation: js.UndefOr[String] = js.undefined
        
        /** A short summary of the claim being evaluated. Corresponds to `ClaimReview.claimReviewed`. */
        var claimReviewed: js.UndefOr[String] = js.undefined
        
        /** Info about the rating of this claim review. */
        var rating: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] = js.undefined
        
        /**
          * This field is optional, and will default to the page URL. We provide this field to allow you the override the default value, but the only permitted override is the page URL plus an
          * optional anchor link ("page jump"). Corresponds to `ClaimReview.url`
          */
        var url: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup](x: Self) {
          
          inline def setClaimAppearances(value: js.Array[String]): Self = StObject.set(x, "claimAppearances", value.asInstanceOf[js.Any])
          
          inline def setClaimAppearancesUndefined: Self = StObject.set(x, "claimAppearances", js.undefined)
          
          inline def setClaimAppearancesVarargs(value: String*): Self = StObject.set(x, "claimAppearances", js.Array(value*))
          
          inline def setClaimAuthor(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor): Self = StObject.set(x, "claimAuthor", value.asInstanceOf[js.Any])
          
          inline def setClaimAuthorUndefined: Self = StObject.set(x, "claimAuthor", js.undefined)
          
          inline def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
          
          inline def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
          
          inline def setClaimFirstAppearance(value: String): Self = StObject.set(x, "claimFirstAppearance", value.asInstanceOf[js.Any])
          
          inline def setClaimFirstAppearanceUndefined: Self = StObject.set(x, "claimFirstAppearance", js.undefined)
          
          inline def setClaimLocation(value: String): Self = StObject.set(x, "claimLocation", value.asInstanceOf[js.Any])
          
          inline def setClaimLocationUndefined: Self = StObject.set(x, "claimLocation", js.undefined)
          
          inline def setClaimReviewed(value: String): Self = StObject.set(x, "claimReviewed", value.asInstanceOf[js.Any])
          
          inline def setClaimReviewedUndefined: Self = StObject.set(x, "claimReviewed", js.undefined)
          
          inline def setRating(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
          
          inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage extends StObject {
        
        /** Info about the author of this claim review. Similar to the above, semantically these are page-level fields, and each `ClaimReview` on this page will contain the same values. */
        var claimReviewAuthor: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] = js.undefined
        
        /** A list of individual claim reviews for this page. Each item in the list corresponds to one `ClaimReview` element. */
        var claimReviewMarkups: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]] = js.undefined
        
        /** The name of this `ClaimReview` markup page resource, in the form of `pages/{page_id}`. Except for update requests, this field is output-only and should not be set by the user. */
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * The URL of the page associated with this `ClaimReview` markup. While every individual `ClaimReview` has its own URL field, semantically this is a page-level field, and each
          * `ClaimReview` on this page will use this value unless individually overridden. Corresponds to `ClaimReview.url`
          */
        var pageUrl: js.UndefOr[String] = js.undefined
        
        /**
          * The date when the fact check was published. Similar to the URL, semantically this is a page-level field, and each `ClaimReview` on this page will contain the same value. Corresponds
          * to `ClaimReview.datePublished`
          */
        var publishDate: js.UndefOr[String] = js.undefined
        
        /** The version ID for this markup. Except for update requests, this field is output-only and should not be set by the user. */
        var versionId: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage](x: Self) {
          
          inline def setClaimReviewAuthor(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor): Self = StObject.set(x, "claimReviewAuthor", value.asInstanceOf[js.Any])
          
          inline def setClaimReviewAuthorUndefined: Self = StObject.set(x, "claimReviewAuthor", js.undefined)
          
          inline def setClaimReviewMarkups(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]): Self = StObject.set(x, "claimReviewMarkups", value.asInstanceOf[js.Any])
          
          inline def setClaimReviewMarkupsUndefined: Self = StObject.set(x, "claimReviewMarkups", js.undefined)
          
          inline def setClaimReviewMarkupsVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup*): Self = StObject.set(x, "claimReviewMarkups", js.Array(value*))
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
          
          inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
          
          inline def setPublishDate(value: String): Self = StObject.set(x, "publishDate", value.asInstanceOf[js.Any])
          
          inline def setPublishDateUndefined: Self = StObject.set(x, "publishDate", js.undefined)
          
          inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
          
          inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends StObject {
        
        /** The list of claims and all of their associated information. */
        var claims: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.undefined
        
        /** The next pagination token in the Search response. It should be used as the `page_token` for the following request. An empty value means no more results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse](x: Self) {
          
          inline def setClaims(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1Claim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
          
          inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
          
          inline def setClaimsVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1Claim*): Self = StObject.set(x, "claims", js.Array(value*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends StObject {
        
        /** The result list of pages of `ClaimReview` markup. */
        var claimReviewMarkupPages: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.undefined
        
        /** The next pagination token in the Search response. It should be used as the `page_token` for the following request. An empty value means no more results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse](x: Self) {
          
          inline def setClaimReviewMarkupPages(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]): Self = StObject.set(x, "claimReviewMarkupPages", value.asInstanceOf[js.Any])
          
          inline def setClaimReviewMarkupPagesUndefined: Self = StObject.set(x, "claimReviewMarkupPages", js.undefined)
          
          inline def setClaimReviewMarkupPagesVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage*): Self = StObject.set(x, "claimReviewMarkupPages", js.Array(value*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleFactcheckingFactchecktoolsV1alpha1Publisher extends StObject {
        
        /** The name of this publisher. For instance, "Awesome Fact Checks". */
        var name: js.UndefOr[String] = js.undefined
        
        /** Host-level site name, without the protocol or "www" prefix. For instance, "awesomefactchecks.com". This value of this field is based purely on the claim review URL. */
        var site: js.UndefOr[String] = js.undefined
      }
      object GoogleFactcheckingFactchecktoolsV1alpha1Publisher {
        
        inline def apply(): GoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1Publisher]
        }
        
        extension [Self <: GoogleFactcheckingFactchecktoolsV1alpha1Publisher](x: Self) {
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
          
          inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait GoogleProtobufEmpty extends StObject
      
      @js.native
      trait PagesResource extends StObject {
        
        /** Create `ClaimReview` markup on a page. */
        def create(request: Alt): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        def create(request: Callback, body: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        
        /** Delete all `ClaimReview` markup on a page. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Fields): Request[js.Object] = js.native
        
        /** Get all `ClaimReview` markup on a page. */
        def get(): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        def get(request: Fields): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        
        /** List the `ClaimReview` markup pages for a specific URL or for an organization. */
        def list(): Request[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
        def list(request: Key): Request[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
        
        def update(request: Fields, body: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
        /**
          * Update for all `ClaimReview` markup on a page Note that this is a full update. To retain the existing `ClaimReview` markup on a page, first perform a Get operation, then modify the
          * returned markup, and finally call Update with the entire `ClaimReview` markup as the body.
          */
        def update(request: Name): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
      }
    }
  }
}
