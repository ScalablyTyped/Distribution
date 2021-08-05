package typings.maximMazurokGapiClientLibraryagent

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLibraryagent.anon.Accesstoken
import typings.maximMazurokGapiClientLibraryagent.anon.Alt
import typings.maximMazurokGapiClientLibraryagent.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object libraryagent {
      
      @js.native
      trait BooksResource extends StObject {
        
        /**
          * Borrow a book from the library. Returns the book if it is borrowed successfully. Returns NOT_FOUND if the book does not exist in the library. Returns quota exceeded error if the
          * amount of books borrowed exceeds allocation quota in any dimensions.
          */
        def borrow(): Request[GoogleExampleLibraryagentV1Book] = js.native
        def borrow(request: Accesstoken): Request[GoogleExampleLibraryagentV1Book] = js.native
        
        /** Gets a book. Returns NOT_FOUND if the book does not exist. */
        def get(): Request[GoogleExampleLibraryagentV1Book] = js.native
        def get(request: Accesstoken): Request[GoogleExampleLibraryagentV1Book] = js.native
        
        /**
          * Lists books in a shelf. The order is unspecified but deterministic. Newly created books will not necessarily be added to the end of this list. Returns NOT_FOUND if the shelf does
          * not exist.
          */
        def list(): Request[GoogleExampleLibraryagentV1ListBooksResponse] = js.native
        def list(request: Alt): Request[GoogleExampleLibraryagentV1ListBooksResponse] = js.native
        
        /**
          * Return a book to the library. Returns the book if it is returned to the library successfully. Returns error if the book does not belong to the library or the users didn't borrow
          * before.
          */
        def `return`(): Request[GoogleExampleLibraryagentV1Book] = js.native
        def `return`(request: Accesstoken): Request[GoogleExampleLibraryagentV1Book] = js.native
      }
      
      trait GoogleExampleLibraryagentV1Book extends StObject {
        
        /** The name of the book author. */
        var author: js.UndefOr[String] = js.undefined
        
        /** The resource name of the book. Book names have the form `shelves/{shelf_id}/books/{book_id}`. The name is ignored when creating a book. */
        var name: js.UndefOr[String] = js.undefined
        
        /** Value indicating whether the book has been read. */
        var read: js.UndefOr[Boolean] = js.undefined
        
        /** The title of the book. */
        var title: js.UndefOr[String] = js.undefined
      }
      object GoogleExampleLibraryagentV1Book {
        
        inline def apply(): GoogleExampleLibraryagentV1Book = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleExampleLibraryagentV1Book]
        }
        
        extension [Self <: GoogleExampleLibraryagentV1Book](x: Self) {
          
          inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
          
          inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
          
          inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      trait GoogleExampleLibraryagentV1ListBooksResponse extends StObject {
        
        /** The list of books. */
        var books: js.UndefOr[js.Array[GoogleExampleLibraryagentV1Book]] = js.undefined
        
        /** A token to retrieve next page of results. Pass this value in the ListBooksRequest.page_token field in the subsequent call to `ListBooks` method to retrieve the next page of results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleExampleLibraryagentV1ListBooksResponse {
        
        inline def apply(): GoogleExampleLibraryagentV1ListBooksResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleExampleLibraryagentV1ListBooksResponse]
        }
        
        extension [Self <: GoogleExampleLibraryagentV1ListBooksResponse](x: Self) {
          
          inline def setBooks(value: js.Array[GoogleExampleLibraryagentV1Book]): Self = StObject.set(x, "books", value.asInstanceOf[js.Any])
          
          inline def setBooksUndefined: Self = StObject.set(x, "books", js.undefined)
          
          inline def setBooksVarargs(value: GoogleExampleLibraryagentV1Book*): Self = StObject.set(x, "books", js.Array(value :_*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleExampleLibraryagentV1ListShelvesResponse extends StObject {
        
        /**
          * A token to retrieve next page of results. Pass this value in the ListShelvesRequest.page_token field in the subsequent call to `ListShelves` method to retrieve the next page of
          * results.
          */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** The list of shelves. */
        var shelves: js.UndefOr[js.Array[GoogleExampleLibraryagentV1Shelf]] = js.undefined
      }
      object GoogleExampleLibraryagentV1ListShelvesResponse {
        
        inline def apply(): GoogleExampleLibraryagentV1ListShelvesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleExampleLibraryagentV1ListShelvesResponse]
        }
        
        extension [Self <: GoogleExampleLibraryagentV1ListShelvesResponse](x: Self) {
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          inline def setShelves(value: js.Array[GoogleExampleLibraryagentV1Shelf]): Self = StObject.set(x, "shelves", value.asInstanceOf[js.Any])
          
          inline def setShelvesUndefined: Self = StObject.set(x, "shelves", js.undefined)
          
          inline def setShelvesVarargs(value: GoogleExampleLibraryagentV1Shelf*): Self = StObject.set(x, "shelves", js.Array(value :_*))
        }
      }
      
      trait GoogleExampleLibraryagentV1Shelf extends StObject {
        
        /** Output only. The resource name of the shelf. Shelf names have the form `shelves/{shelf_id}`. The name is ignored when creating a shelf. */
        var name: js.UndefOr[String] = js.undefined
        
        /** The theme of the shelf */
        var theme: js.UndefOr[String] = js.undefined
      }
      object GoogleExampleLibraryagentV1Shelf {
        
        inline def apply(): GoogleExampleLibraryagentV1Shelf = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleExampleLibraryagentV1Shelf]
        }
        
        extension [Self <: GoogleExampleLibraryagentV1Shelf](x: Self) {
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
          
          inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
        }
      }
      
      @js.native
      trait ShelvesResource extends StObject {
        
        var books: BooksResource = js.native
        
        /** Gets a shelf. Returns NOT_FOUND if the shelf does not exist. */
        def get(): Request[GoogleExampleLibraryagentV1Shelf] = js.native
        def get(request: Accesstoken): Request[GoogleExampleLibraryagentV1Shelf] = js.native
        
        /** Lists shelves. The order is unspecified but deterministic. Newly created shelves will not necessarily be added to the end of this list. */
        def list(): Request[GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
        def list(request: Callback): Request[GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      }
    }
  }
}
